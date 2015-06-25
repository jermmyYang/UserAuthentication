package cn.com.sy.entity;

import java.io.Serializable;
import java.util.Date;

public class TbUserLog implements Serializable {

	/**
	   * 
	    */
	private static final long serialVersionUID = -8954123273663853959L;

	private long pkId;

	private long userId;

	private String loginIp;

	private Date loginTime;

	public long getPkId() {
		return pkId;
	}

	public void setPkId(long pkId) {
		this.pkId = pkId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
    
}
