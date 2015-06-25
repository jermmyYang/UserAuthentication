package cn.com.sy.oauth.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.AuthorizationRequest;
import org.springframework.security.oauth2.provider.approval.TokenServicesUserApprovalHandler;

import cn.com.sy.entity.OauthClientDetails;
import cn.com.sy.service.OauthService;


public class OauthUserApprovalHandler extends TokenServicesUserApprovalHandler {

	    private OauthService oauthService;

	    public OauthUserApprovalHandler() {
	    }


	    public boolean isApproved(AuthorizationRequest authorizationRequest, Authentication userAuthentication) {
	        if (super.isApproved(authorizationRequest, userAuthentication)) {
	            return true;
	        }
	        if (!userAuthentication.isAuthenticated()) {
	            return false;
	        }

	        OauthClientDetails clientDetails = oauthService.loadOauthClientDetails(authorizationRequest.getClientId());
	        return clientDetails != null && clientDetails.trusted();

	    }
	    public void setOauthService(OauthService oauthService) {
	        this.oauthService = oauthService;
	    }
}
