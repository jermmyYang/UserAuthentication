package cn.com.sy.service;

import cn.com.sy.entity.TbUser;

public interface TbUserService {

	     void addUser(TbUser user);
	
	     void updateUser(String userId, String password);
	     
	     TbUser getUserById(String userId);
	     
	     TbUser getUserByLogin(TbUser user);
	     
	     TbUser getUserByEmail(TbUser user);
	     
	     TbUser getUserByMobile(String mobile);
	     
	     void updateUserPhoto(TbUser user);
	     
	     void updateUserEmail(TbUser user);
	     
	     /**
	      * 添加用户名
	     * @param user
	     */
	    void updateUserName(TbUser user);
	    
	    /**
	     * 更新用户基本信息
	     * @param user
	     */
	    void updateUserInfo(TbUser user);
}
