package cn.com.sy.dao;

import java.util.List;

import cn.com.sy.annotation.DataAccessRepository;
import cn.com.sy.entity.TbUserLog;

/**
 * 用户登录日志
 * @author Administrator
 *
 */
 @DataAccessRepository
public interface TbUserLogDao {
     
	      public void addLog(TbUserLog log); 
	      
	      public String getLogIpList(TbUserLog log);
	      
	      public List<TbUserLog> getLogList(TbUserLog log);
	
}
