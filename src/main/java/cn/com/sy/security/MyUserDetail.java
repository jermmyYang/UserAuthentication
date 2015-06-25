package cn.com.sy.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import cn.com.sy.entity.Privilege;
import cn.com.sy.entity.TbUser;
import cn.com.sy.entity.User;

public class MyUserDetail implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6974494119345795813L;
	protected static final String ROLE_PREFIX = "ROLE_";
    protected static final GrantedAuthority DEFAULT_USER_ROLE = new SimpleGrantedAuthority(ROLE_PREFIX + Privilege.USER.name());

    protected TbUser user;

    protected List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
	
    
    public MyUserDetail(TbUser user){
    	  this.user = user;
    	  initialAuthorities();
    }
	
    
    public  void initialAuthorities(){
    	 this.grantedAuthorities.add(DEFAULT_USER_ROLE);
         //default user have all privileges
       /*  if (user.isDefaultUser()) {
             this.grantedAuthorities.add(new SimpleGrantedAuthority(ROLE_PREFIX + Privilege.UNITY.name()));
             this.grantedAuthorities.add(new SimpleGrantedAuthority(ROLE_PREFIX + Privilege.MOBILE.name()));
         } else {
             List<Privilege> privileges = user.getPrivileges();
             for (Privilege privilege : privileges) {
                 this.grantedAuthorities.add(new SimpleGrantedAuthority(ROLE_PREFIX + privilege.name()));
             }
         }*/
    }
    
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.grantedAuthorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}


	public TbUser getUser() {
		return user;
	}


	public void setUser(TbUser user) {
		this.user = user;
	}


}
