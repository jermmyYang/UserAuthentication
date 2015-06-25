package cn.com.test;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.AuthorizationRequest;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

public class TestOAuth2Authentication extends OAuth2Authentication {

	public TestOAuth2Authentication(AuthorizationRequest authorizationRequest,
			Authentication userAuthentication) {
		super(authorizationRequest, userAuthentication);
	}

}
