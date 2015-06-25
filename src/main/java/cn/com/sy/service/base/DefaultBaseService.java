package cn.com.sy.service.base;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import cn.com.sy.util.PageResult;

/**
 * 后台基本服务
 * @author Administrator
 *
 */
@Service
public abstract class DefaultBaseService<T> extends SqlSessionDaoSupport{
	
	public static final String SQLNAME_SEPARATOR = ".";

	public static final String SQL_SAVE = "save";   
	public static final String SQL_UPDATE = "update";   
	public static final String SQL_GETBYID = "getById";
	public static final String SQL_DELETEBYID = "deleteById";
	public static final String SQL_DELETEBYIDS = "deleteByIds";
	public static final String SQL_FINDPAGEBY = "findPageBy";   
	public static final String SQL_FINDLISTBY = "findListBy";
	public static final String SQL_GETCOUNTBY = "getCountBy";
	private static final String SORT_NAME = "SORT";
	private static final String DIR_NAME = "DIR";
	
	
	/** 不能用于sql中的非法字符(主要用于排序字段名) */
	public static final String[] ILLEGAL_CHARS_FOR_SQL = {",", ";", " ", "\"", "%"};

	protected Logger logger = LogManager.getLogger(DefaultBaseService.class.getName());
	
	/**
	 * 分页查询
	 * @param parameter			查询对象
	 * @param currPage			当前页码
	 * @param pageSize			每页条数
	 * @return
	 * @throws Exception
	 */
	public <T> PageResult<T> getPageList(Object parameter,int curPage,int pageSize) throws Exception{
		return this.getPageList(this.SQL_FINDPAGEBY,this.SQL_GETCOUNTBY,parameter, curPage, pageSize);
	}
	
	/**
	 * 分页查询
	 * @param statement			mapper.xml中分页查询的sqlId			   此参数为空默认为findPageBy
	 * @param countStatement	mapper.xml中分页查询(count结果)的sqlId 此参数为空默认为getCountBy
	 * @param parameter			查询对象
	 * @param currPage			当前页码
	 * @param pageSize			每页条数
	 * @return
	 * @throws Exception 
	 */
	public <T> PageResult<T> getPageList(String statement,  String countStatement,Object parameter,int curPage,int pageSize) throws Exception{
		logger.info("****************Enter DefaultBaseService.getPageList()****************");
		long begin = System.currentTimeMillis();
		if(pageSize < 1 || curPage < 1){
			throw new Exception("Invalid pageSize[=" + pageSize+ "] and curentPageNum[=" + curPage + "] Parament!");
		}
		
		PageResult<T> pret = new PageResult<T>();
		pret.setTotalRecords(countSql(countStatement!=null?countStatement:this.SQL_GETCOUNTBY, parameter));
		
		if(pret.getTotalRecords() > 0){
			int totalPages = pret.getTotalRecords()/pageSize + (pret.getTotalRecords()%pageSize > 0 ? 1 : 0);
			pret.setTotalPages(totalPages);
			if(curPage > pret.getTotalPages()){
				pret.setCurPage(1);
			}else{
				pret.setCurPage(curPage);
				long begin1 = System.currentTimeMillis();
				List  result = this.getSqlSession().selectList(statement, parameter, new RowBounds(curPage, pageSize));
				logger.debug("分页查询============="+(System.currentTimeMillis() - begin1));
				pret.setRecords(result);
			}
		}else{
			pret.setCurPage(0);
			pret.setTotalPages(0);
			pret.setRecords(new ArrayList());
		}
		logger.debug("耗时========="+(System.currentTimeMillis() - begin));
		logger.info("****************Out DefaultBaseService.getPageList()****************");
		return pret;
	}
	
	/**
	 * countSql 
	 * @param countStatement
	 * @param parameter
	 * @return
	 */
	public int countSql(String countStatement, Object parameter){
		int i =  (Integer) this.getSqlSession().selectOne(getMapperNameSpace()+this.SQLNAME_SEPARATOR+countStatement, parameter);
		return i;
	}
	
	/**
	 * 获取Mapper namespace
	 * @return
	 */
	public abstract String getMapperNameSpace();
	
	
}
