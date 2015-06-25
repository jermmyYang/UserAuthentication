package cn.com.sy.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Service;

import cn.com.sy.dao.OauthUserDao;
import cn.com.sy.entity.TbUser;
import cn.com.sy.entity.User;
import cn.com.sy.entity.UserJsonDto;
import cn.com.sy.security.MyUserDetail;
import cn.com.sy.service.UserService;

@Service("myUserService")
public class UserServiceImpl implements UserService,UserDetailsService{

    @Autowired
    private OauthUserDao oauthUserDao;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser user = oauthUserDao.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Not found any user for username[" + username + "]");
        }
        MyUserDetail detail = new MyUserDetail(user);
        detail.setUser(user);
        return detail;
    }

   /* public UserJsonDto loadCurrentUserJsonDto() {
    	SecurityContext context = SecurityContextHolder.getContext();
    	final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        final Object principal = authentication.getPrincipal();

        if (authentication instanceof OAuth2Authentication &&
                (principal instanceof String || principal instanceof org.springframework.security.core.userdetails.User)) {
            return loadOauthUserJsonDto((OAuth2Authentication) authentication);
        } else {
            final MyUserDetail userDetails = (MyUserDetail) principal;
            return new UserJsonDto(oauthUserDao.findByGuid(userDetails.getUser().guid()));
        }
    }*/

    private UserJsonDto loadOauthUserJsonDto(OAuth2Authentication oAuth2Authentication) {
        UserJsonDto userJsonDto = new UserJsonDto();
        userJsonDto.setUsername(oAuth2Authentication.getName());

        final Collection<GrantedAuthority> authorities = oAuth2Authentication.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            userJsonDto.getPrivileges().add(authority.getAuthority());
        }

        return userJsonDto;
    }

	@Override
	public UserJsonDto getUserInfoByToken(String token) {
		 TbUser user = oauthUserDao.getUserByToken(token);
		 return new UserJsonDto(user);
	}

	@Override
	public UserJsonDto loadCurrentUserJsonDto() {
		return null;
	}
}