package cn.com.sy.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;

import cn.com.sy.entity.UserJsonDto;

public interface UserService extends UserDetailsService {

    UserJsonDto loadCurrentUserJsonDto();
    
    /**
     * 根据token获取用户信息
     * @param token
     * @return
     */
    UserJsonDto getUserInfoByToken(String token);
    
}