package cn.com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.sy.dao.TbUserLogDao;
import cn.com.sy.entity.TbUserLog;
import cn.com.sy.service.TbUserLogService;
import cn.com.sy.service.impl.TbUserLogServiceImpl;
import cn.com.sy.util.PageResult;

public class TestService{

	public static void main(String[] args) throws Exception {

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		TbUserLogService service = (TbUserLogService) ctx.getBean("logService");
		TbUserLog log = new TbUserLog();
		log.setUserId(7);
		String ips = service.getIpList(log);
		
		List<TbUserLog> ip1s = service.getLogList(log);
		/*for(String ip:ips){
			System.out.println(ip);
		}*/
		System.out.println(ips);
		
		System.out.println(ip1s);
		
		for(TbUserLog log1:ip1s){
			System.out.println(log1.getLoginIp()+" "+log1.getUserId());
		}
/*		TbUserLogService service = new TbUserLogServiceImpl();
		TbUserLog log = new TbUserLog();
		log.setUserId(7);
		PageResult<TbUserLog> logs = service.getLogList(log, 1);*/
		
	}
	
	

}
