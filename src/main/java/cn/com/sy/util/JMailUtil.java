package cn.com.sy.util;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class JMailUtil {
	
	     private static String user = "y769393108@163.com";
	     private static String pwd = "200804yang";

	     public static void sendEmail(String title,String message,String email) throws MessagingException{
	    	 
	    	  Properties props = new Properties();
	          props.setProperty("mail.smtp.auth", "true");//设置访问smtp服务器需要认证
	          props.setProperty("mail.transport.protocol", "smtp"); //设置访问服务器的协议
	           
	          Session session = Session.getDefaultInstance(props);
	          session.setDebug(true); //打开debug功能
	           
	          Message msg = new MimeMessage(session);
	          msg.setFrom(new InternetAddress(user)); //设置发件人，163邮箱要求发件人与登录用户必须一致（必填），其它邮箱不了解
	          msg.setText(message); //设置邮件内容
	          msg.setSubject("Test"); //设置邮件主题
	           
	          Transport trans = session.getTransport();
	          try{
	        	  trans.connect("smtp.163.com", 25, user,pwd); //连接邮箱smtp服务器，25为默认端口 
	          }
	          catch(Exception e){
	        	  e.printStackTrace();
	          }
	          
	          try{
	        	  trans.sendMessage(msg, new Address[]{new InternetAddress(email)}); //发送邮件
	          }
	          catch(Exception e){
	        	  e.printStackTrace();
	          }
	          
	           
	          trans.close(); //关闭连接
	     }
	 
	       public static void main(String[] args) throws MessagingException {
	    	   JMailUtil.sendEmail("测试", "哈哈", "y769393108@163.com");
	    	   
		}
	
}
