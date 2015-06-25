package cn.com.sy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.sy.constants.AppConstants;
import cn.com.sy.dao.TbUserLogDao;
import cn.com.sy.entity.TbUserLog;
import cn.com.sy.service.TbUserLogService;
import cn.com.sy.service.base.DefaultBaseService;
import cn.com.sy.util.PageResult;


@Service("logService")
public class TbUserLogServiceImpl extends DefaultBaseService<TbUserLog> implements
		TbUserLogService {

	@Autowired
	private TbUserLogDao logDao;
	
	@Override
	public void addTbUserLog(TbUserLog log) {
		 logDao.addLog(log);
	}

	@Override
	public PageResult<TbUserLog> getLogList(TbUserLog log, int curPage) throws Exception {
		PageResult<TbUserLog> ps = super.getPageList("getLogList", "getLogCount", log, curPage, AppConstants.PAGE_SIZE);
		return ps;
	}

	
	/* (non-Javadoc)
	 * 返回mapper的命名空间
	 * @see cn.com.sy.service.base.DefaultBaseService#getMapperNameSpace()
	 */
	@Override
	public String getMapperNameSpace() {
		return TbUserLogDao.class.getName();
	}

	public static void main(String[] args) {
		
		TbUserLogService serviceImpl = new TbUserLogServiceImpl();
		
		TbUserLog log = new TbUserLog();
		
		try {
			PageResult<TbUserLog> loglist = serviceImpl.getLogList(log, 1);
			System.out.println(loglist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String getIpList(TbUserLog log) {
		return logDao.getLogIpList(log);
	}

	@Override
	public List<TbUserLog> getLogList(TbUserLog log) {
		return logDao.getLogList(log);
	}
	
	
}
