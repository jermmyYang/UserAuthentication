package cn.com.sy.dao;

import org.apache.ibatis.annotations.Param;

import cn.com.sy.annotation.DataAccessRepository;
import cn.com.sy.entity.TbUser;
import cn.com.sy.entity.User;


@DataAccessRepository
public interface OauthUserDao {

	User findByGuid(String guid);

	void saveUser(User user);

	void updateUser(User user);

	TbUser findByUsername(String username);
	
	TbUser getUserByToken(@Param("accessToken") String token);

}
