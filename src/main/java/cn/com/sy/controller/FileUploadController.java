package cn.com.sy.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.com.sy.entity.TbUser;
import cn.com.sy.service.TbUserService;

/**
 * 文件上传
 * 
 * @author Administrator
 */
@Controller
public class FileUploadController {

	
	@Autowired
	TbUserService userService;
	
	@RequestMapping(value="/img/upload")
	public void upload(@RequestParam(value = "file", required = false) MultipartFile file,
			HttpServletRequest request) {

		    String path = request.getSession().getServletContext().getRealPath("/WEB-INF/resources/upload");  
	        String fileName = file.getOriginalFilename();  
	        
	        try {
				    FileUtils.writeByteArrayToFile(new File(path, fileName), file.getBytes());
				    //将图片路径保存到数据库中
				    HttpSession session = request.getSession();
		            TbUser user = (TbUser) session.getAttribute("userObject");
		            String photo = "resources/upload/"+fileName;
		            user.setPhoto(photo);
		            userService.updateUserPhoto(user);
				
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
	       
	}

}
