package cn.com.sy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.sy.annotation.DataAccessRepository;
import cn.com.sy.entity.TbUser;

@DataAccessRepository
public interface TbUserDao {

	    public void addUser(TbUser user);
	    
	    public void updateUser(TbUser user);
	    
	    /**
	     * 上传用户图片
	     */
	    public void updateUserPhoto(TbUser user);
	    
	    public TbUser getUserByLogin(TbUser user);
	    
	    public TbUser getUserByEmail(TbUser user);
	    
	    public TbUser getUserByMobile(@Param("mobile") String mobile);
	    
	    public TbUser getUserById(@Param("userId") String userId);
	    
	    public void updateUserEmail(TbUser user);
	    
	    /**
	     * 添加用户名
	     * @param user
	     */
	    public void updateUserName(TbUser user);
	    
	    /**
	     * 确定用户名是否存在
	     * @return
	     */
	    public List<TbUser> getUserListByName(TbUser user);
	    
	    /**
	     * 更新用户信息
	     * @param user
	     */
	    public void updateUserInfo(TbUser user);
	    
}
