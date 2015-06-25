package cn.com.test;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.AuthorizationRequest;

public class TestAuthorizationRequest implements AuthorizationRequest,Serializable {

	@Override
	public Map<String, String> getAuthorizationParameters() {
		return null;
	}

	@Override
	public Map<String, String> getApprovalParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getClientId() {
		// TODO Auto-generated method stub
		return "TT";
	}

	@Override
	public Set<String> getScope() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getResourceIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isApproved() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDenied() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRedirectUri() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getResponseTypes() {
		// TODO Auto-generated method stub
		return null;
	}

}
