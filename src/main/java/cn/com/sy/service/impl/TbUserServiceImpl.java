package cn.com.sy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.sy.constants.ErrorCode;
import cn.com.sy.dao.TbUserDao;
import cn.com.sy.entity.TbUser;
import cn.com.sy.service.TbUserService;
import cn.com.sy.util.Md5Util;

@Service
public class TbUserServiceImpl implements TbUserService {

	@Autowired
	private TbUserDao userDao;
	@Override
	public void addUser(TbUser user) {
		userDao.addUser(user);
	}
	@Override
	public void updateUser(String userId, String password) {
		
		TbUser qUser = userDao.getUserById(userId);
		
	    qUser.setPassword(Md5Util.GetMD5Code(password));
		
        userDao.updateUser(qUser);		
	}
	@Override
	public TbUser getUserByLogin(TbUser user) {
		return userDao.getUserByLogin(user);
	}
	@Override
	public TbUser getUserByEmail(TbUser user) {
		return userDao.getUserByEmail(user);
	}
	@Override
	public TbUser getUserByMobile(String mobile) {
		return userDao.getUserByMobile(mobile);
	}
	@Override
	public TbUser getUserById(String userId) {
		return userDao.getUserById(userId);
	}
	@Override
	public void updateUserPhoto(TbUser user) {
		 userDao.updateUserPhoto(user);
	}
	@Override
	public void updateUserEmail(TbUser user) {
		 userDao.updateUserEmail(user);
	}
	@Override
	public void updateUserName(TbUser user) {
		
		 List<TbUser> users = userDao.getUserListByName(user);
		
		 if(users.size()!=0){
			 throw new RuntimeException(ErrorCode.ADD_USER_NAME_ERROR.getMessage());
		 }
		 else{
			 TbUser qUser = userDao.getUserById(Long.toString(user.getPkId()));
			 qUser.setUserName(user.getUserName());
			 userDao.updateUserName(qUser); 
		 }
	}
	@Override
	public void updateUserInfo(TbUser user) {
		
		   TbUser qUser = userDao.getUserById(Long.toString(user.getPkId()));
		   qUser.setSex(user.getSex());
		   qUser.setBirthday(user.getBirthday());
		   userDao.updateUserInfo(qUser);
	}
	
	
	
}
