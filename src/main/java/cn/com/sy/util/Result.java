package cn.com.sy.util;

import java.io.Serializable;

import org.springframework.security.oauth2.common.OAuth2AccessToken;

/**
 * spring mvc 状态信息
 * @author jermmy
 *
 */
public class Result implements Serializable{
          
	        private int status;
	        
	        private String message;
	        
	        private OAuth2AccessToken access_token;

			public String getMessage() {
				return message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public int getStatus() {
				return status;
			}

			public void setStatus(int status) {
				this.status = status;
			}

			public OAuth2AccessToken getAccess_token() {
				return access_token;
			}

			public void setAccess_token(OAuth2AccessToken token) {
				this.access_token = token;
			}
			
			
}
