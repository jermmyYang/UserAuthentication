package cn.com.test;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;

public class TestOAuth2AccessToken implements OAuth2AccessToken,Serializable{

	@Override
	public Map<String, Object> getAdditionalInformation() {
		return null;
	}

	@Override
	public Set<String> getScope() {
		return null;
	}

	@Override
	public OAuth2RefreshToken getRefreshToken() {
		return null;
	}

	@Override
	public String getTokenType() {
		return null;
	}

	@Override
	public boolean isExpired() {
		return true;
	}

	@Override
	public Date getExpiration() {
		return null;
	}

	@Override
	public int getExpiresIn() {
		return 0;
	}

	@Override
	public String getValue() {
		return "test";
	}

}
