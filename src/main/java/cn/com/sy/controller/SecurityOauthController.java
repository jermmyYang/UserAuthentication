package cn.com.sy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.DefaultAuthorizationRequest;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.password.ResourceOwnerPasswordTokenGranter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.sy.constants.ErrorCode;
import cn.com.sy.entity.MyAccessToken;
import cn.com.sy.entity.UserJsonDto;
import cn.com.sy.service.UserService;
import cn.com.sy.util.Md5Util;
import cn.com.sy.util.Result;

@Controller
public class SecurityOauthController {
	
	@Autowired
	private UserService userService;
    
	@Autowired 
	private ResourceOwnerPasswordTokenGranter resourceOwnerPasswordTokenGranter;
	
	
	@RequestMapping(value="/oauth/token",method=RequestMethod.GET)
	@ResponseBody
	public Object getAccessToken(@RequestParam(value = "grant_type", required = false) String grantType,
			@RequestParam Map<String, String> parameters){
		
		String password  = parameters.get("password");
		parameters.put("password", Md5Util.GetMD5Code(password));
		HashMap<String, String> request = new HashMap<String, String>(parameters);
		DefaultAuthorizationRequest authorizationRequest = new DefaultAuthorizationRequest(request);
		OAuth2AccessToken token = null;
		try{
			 token = resourceOwnerPasswordTokenGranter.grant(grantType, authorizationRequest);
		}
		catch(Exception e){
			e.printStackTrace();
			Result result = new Result();
			result.setMessage(e.getMessage());
			return result;
		}
		MyAccessToken myToken = new MyAccessToken();
		myToken.setAccessToken(Md5Util.GetMD5Code(token.getValue()));
		myToken.setExpire_date(token.getExpiresIn());
		myToken.setScope(token.getScope());
		
		return myToken;
	}
	@RequestMapping(value="/oauth2/user",method=RequestMethod.GET)
	@ResponseBody
	public Object getInfo(@RequestParam("access_token") String token){
		
		
		UserJsonDto jsonDto = null;
		
		try{
			jsonDto = userService.getUserInfoByToken(token);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		if(jsonDto==null){
			Result result = new Result();
			
			result.setStatus(ErrorCode.ACCESS_TOKEN_INVALIDATE.getErrorCode());
			
			result.setMessage(ErrorCode.ACCESS_TOKEN_INVALIDATE.getMessage());
			
			return result;
		}
		return jsonDto;
	}
	
	@RequestMapping(value="/oauth2/authorize",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView getAuthorizePage(@RequestParam("redirect_url") String redirectUrl,@RequestParam("client_id") String clientId,@RequestParam("grant_type") String grandType){
		
		ModelAndView view = new ModelAndView("/authrorize");
		
		return view;
	}
	
	
}
