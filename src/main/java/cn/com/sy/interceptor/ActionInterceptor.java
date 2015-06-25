package cn.com.sy.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.com.sy.entity.TbUser;

/**
 * 动作拦截器
 * @author jermmy
 *
 */
public class ActionInterceptor implements HandlerInterceptor{

	/**
	 * 不被拦截的请求
	 */
	private List<String> excludeUrls;
	
	public List<String> getExcludeUrl() {
		return excludeUrls;
	}

	public void setExcludeUrl(List<String> excludeUrls) {
		this.excludeUrls = excludeUrls;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
           String url =  request.getServletPath();
		   
           if(url.equals("/")){
        	   return true;
           }
           
		   boolean flag =  canAccess(url);
		   
		   if(!flag){
			   
			   TbUser user = (TbUser) request.getSession().getAttribute("userObject");
			   
			   if(user==null){
				   response.sendRedirect("/authentication");
				   return false;
			   }
			   
		   }
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		   
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
	
	private boolean canAccess(String url){
		
		for(String u:excludeUrls){
			
			  if(url.equals(u) || url.contains(u)){
				  return true;
			  }
		}
		return false;
	}

}
