package cn.com.sy.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.sy.client.MyHttpClient;
import cn.com.sy.constants.AppConstants;

@Controller
public class HttpClientController {

	@Value("${sms.smsChanelUrl}")
	private String smsChanelUrl;

	@Value("${sms.method}")
	private String smsMethod;

	@Value("${sms.account}")
	private String account;

	@Value("${sms.password}")
	private String smsPassword;

	@RequestMapping(value = "/mobile/sendMsg", method = RequestMethod.POST)
	@ResponseBody
	public void sendMobileMessage(@RequestParam(value="mobile") String mobile,HttpServletRequest request) {

		Map<String, String> requestParams = new HashMap<String, String>();

		requestParams.put("method", smsMethod);
		requestParams.put("account", account);
		requestParams.put("password", smsPassword);
		requestParams.put("mobile", mobile);
		int random = getRandomNumber();
		String message = AppConstants.MESSAGE.replace("${code}", random+"");
		requestParams.put("content", message);
		String tempUrl = smsChanelUrl+"?method="+smsMethod+"&account="+account+"&password="+smsPassword+"&mobile="+mobile+"&content="+message;
		try{
			MyHttpClient.httpGet(tempUrl, null);
			HttpSession session = request.getSession();
			session.setAttribute("code", random+"");
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	/**
	 * 生产随机数
	 * @return
	 */
	public static int getRandomNumber() {

		Random ran = new Random();
		int r = 0;
		m1: while (true) {
			int n = ran.nextInt(1000000);
			r = n;
			int[] bs = new int[6];
			for (int i = 0; i < bs.length; i++) {
				bs[i] = n % 10;
				n /= 10;
			}
			Arrays.sort(bs);
			for (int i = 1; i < bs.length; i++) {
				if (bs[i - 1] == bs[i]) {
					continue m1;
				}
			}
			break;
		}

		return r;

	}

	public static void main(String[] args) {

		 int random = HttpClientController.getRandomNumber();
		 
		 String message = AppConstants.MESSAGE.replace("${code}", random+"");
		
		  System.out.println(message);
	}

}
