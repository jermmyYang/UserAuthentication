package cn.com.sy.controller;

import java.text.SimpleDateFormat;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.sy.constants.ErrorCode;
import cn.com.sy.entity.TbUser;
import cn.com.sy.entity.TbUserLog;
import cn.com.sy.service.TbUserLogService;
import cn.com.sy.service.TbUserService;
import cn.com.sy.util.Base64Util;
import cn.com.sy.util.JMailUtil;
import cn.com.sy.util.Md5Util;
import cn.com.sy.util.PageResult;
import cn.com.sy.util.Result;

@Controller
public class UserController {

	@Autowired
	private TbUserService userService;

	@Autowired
	private TbUserLogService logService;

	@Value("${mail.url}")
	private String mailUrl;

	/*
	 * @RequestMapping(value = "/authentication") public ModelAndView
	 * home(HttpServletRequest request) { return new
	 * ModelAndView("redirect:index"); }
	 */

	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	@ResponseBody
	public Object login(@RequestParam("mobile") String mobile,
			@RequestParam("code") String code,
			@RequestParam("password") String password,
			HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		Result result = new Result();

		TbUser qUser = userService.getUserByMobile(mobile);

		if (qUser != null) {
			result.setStatus(ErrorCode.EMAIL_EXIST.getErrorCode());
			result.setMessage(ErrorCode.EMAIL_EXIST.getMessage());
			return result;
		}

		String randCode = (String) session.getAttribute("code");
		code = randCode;
		if (randCode == null || !code.equals(randCode)) {
			result.setStatus(ErrorCode.VALIDATE_ERROR.getErrorCode());
			result.setMessage(ErrorCode.VALIDATE_ERROR.getMessage());
			return result;
		} else {
			TbUser user = new TbUser();
			user.setPassword(Md5Util.GetMD5Code(password));
			user.setPhone(mobile);
			userService.addUser(user);
			TbUser u = userService.getUserByMobile(mobile);
			session.setAttribute("userObject", u);
			long id = u.getPkId();
			return id;
		}

	}

	@RequestMapping(value = "/get/person")
	public ModelAndView getPersonPage(HttpServletRequest request) {

		PageResult<TbUserLog> logs = null;
		TbUser loginUser = (TbUser) request.getSession().getAttribute(
				"userObject");

		try {
			TbUserLog log = new TbUserLog();
			log.setUserId(loginUser.getPkId());
			logs = logService.getLogList(log, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView view = new ModelAndView("/person");
		view.addObject("logs", logs);
		view.addObject("user", loginUser);
		return view;
	}

	private String getIp(HttpServletRequest request) {

		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;

	}

	@RequestMapping(value = "/user/register")
	public ModelAndView getRegisterPage() {
		ModelAndView view = new ModelAndView("/register");
		return view;
	}

	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	@ResponseBody
	public Object login(@RequestParam(value = "account") String userName,
			@RequestParam(value = "password") String password,
			HttpServletRequest request) {

		password = Md5Util.GetMD5Code(password);
		TbUser user = new TbUser();
		user.setUserName(userName);
		user.setPassword(password);
		TbUser qUser = userService.getUserByLogin(user);
		Result result = new Result();
		if (qUser == null) {
			result.setStatus(ErrorCode.USER_LOGIN_ERROR.getErrorCode());
			result.setMessage(ErrorCode.USER_LOGIN_ERROR.getMessage());
			return result;
		} else {
			HttpSession session = request.getSession();
			TbUserLog log = new TbUserLog();
			log.setUserId(qUser.getPkId());
			String ip = getIp(request);
			log.setLoginIp(ip);
			logService.addTbUserLog(log);
			session.setAttribute("userObject", qUser);
			return result;
		}

	}

	@RequestMapping(value = "/user/resetPassword", method = RequestMethod.POST)
	@ResponseBody
	public Object resetPassword(@RequestParam("password") String password,
			@RequestParam("userId") String userId) {

		Result result = new Result();

		try {
			userService.updateUser(userId, password);
		} catch (Exception e) {
			e.printStackTrace();
			result.setStatus(ErrorCode.USER_MODIFYED_ERROR.getErrorCode());
			return result;
		}
		return result;

	}

	@RequestMapping(value = "/user/logout")
	public String logout(HttpServletRequest request) {

		HttpSession session = request.getSession();
		session.removeAttribute("userObject");
		return "redirect:/";
	}

	@RequestMapping(value = "/user/forbind")
	@ResponseBody
	public Object toBindEmail(@RequestParam("email") String email)
			throws MessagingException {

		TbUser user = new TbUser();
		user.setEmail(email);
		TbUser qUser = userService.getUserByEmail(user);
		Result result = new Result();

		if (qUser == null) {

			String text = Base64Util.getBase64(email);

			String url = mailUrl + "/user/bind/" + text;

			try{
				JMailUtil.sendEmail("", url, email);
			}catch(Exception e){
				e.printStackTrace();
				result.setStatus(ErrorCode.EMAIL_SEND_UN_AUTHENTICATION.getErrorCode());
				result.setMessage(e.getMessage());
				return result;
			}
			
		} else {
			result.setStatus(ErrorCode.EMAIL_EXIST.getErrorCode());
		}
		return result;
	}

	@RequestMapping(value = "/user/bind/{email}")
	@ResponseBody
	public void bindEmail(@PathVariable("email") String email,
			HttpServletRequest request) {

		String oEmail = Base64Util.getFromBase64(email);

		HttpSession session = request.getSession();

		TbUser user = (TbUser) session.getAttribute("userObject");
		
		user.setEmail(oEmail);

		userService.updateUserEmail(user);

	}

	@RequestMapping(value = "/user/addUserName",method=RequestMethod.POST)
	@ResponseBody
	public Object addUserName(@RequestParam("userName") String userName,
			HttpServletRequest request) {

		HttpSession session = request.getSession();
		TbUser user = (TbUser) session.getAttribute("userObject");
		Result result = new Result();
		try {
			user.setUserName(userName);
			userService.updateUserName(user);
		} catch (Exception e) {
			e.printStackTrace();
			result.setStatus(ErrorCode.ADD_USER_NAME_ERROR.getErrorCode());
		}
		return result;

	}

	@RequestMapping(value = "/user/updateInfo",method=RequestMethod.POST)
	@ResponseBody
	public Object updateUserInfo(@RequestParam("sex") String sex,
			@RequestParam("birthday") String birthday,
			HttpServletRequest request) {
		HttpSession session = request.getSession();
		TbUser user = (TbUser) session.getAttribute("userObject");
        Result result = new Result();
		try{
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			user.setBirthday(fmt.parse(birthday));;
			user.setSex(sex);
			userService.updateUserInfo(user);
		}
		catch(Exception e){
			e.printStackTrace();
			result.setStatus(ErrorCode.UPDATE_USER_INFO_ERROR.getErrorCode());
		}
		return result;
	}
	
	
}
