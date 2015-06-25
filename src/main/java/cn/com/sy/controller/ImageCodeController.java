package cn.com.sy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.sy.util.ImageGenerateUtil;


@Controller
public class ImageCodeController {

	
	       @RequestMapping(value="/code/getImg",method=RequestMethod.GET)
	       
	       public void getCodeImg(HttpServletRequest request,HttpServletResponse response) throws IOException{
	    	   
	    	   String code = ImageGenerateUtil.getCertPic(0, 0, response.getOutputStream());
	    	   HttpSession session = request.getSession();
	    	   session.setAttribute("randCode", code);
	    	   
	       }
	
	
}
