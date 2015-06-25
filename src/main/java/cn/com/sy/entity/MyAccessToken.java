package cn.com.sy.entity;

import java.util.Set;

public class MyAccessToken {

	    private String accessToken;
	    
	    private int expire_date;
	    
	    private Set<String> scope;

		public String getAccessToken() {
			return accessToken;
		}

		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}

		public int getExpire_date() {
			return expire_date;
		}

		public void setExpire_date(int expire_date) {
			this.expire_date = expire_date;
		}

		public Set<String> getScope() {
			return scope;
		}

		public void setScope(Set<String> set) {
			this.scope = set;
		}
	    
	    
	
}
