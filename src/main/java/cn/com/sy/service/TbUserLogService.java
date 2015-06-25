package cn.com.sy.service;

import java.util.List;

import cn.com.sy.entity.TbUserLog;
import cn.com.sy.util.PageResult;

/**
 * @author Administrator
 *
 */
public interface TbUserLogService {
           
	       void addTbUserLog(TbUserLog log);
	       
	       PageResult<TbUserLog> getLogList(TbUserLog log,int curPage) throws Exception;
	       
	       public String getIpList(TbUserLog log);
	       
	       public List<TbUserLog> getLogList(TbUserLog log);
}
