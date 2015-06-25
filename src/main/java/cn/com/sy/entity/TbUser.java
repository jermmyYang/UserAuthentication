package cn.com.sy.entity;

import java.io.Serializable;
import java.util.Date;

public class TbUser implements Serializable{
	
	    /**
	     * 
	    */
	    private static final long serialVersionUID = 1367302051264488010L;

		private long  pkId;
	      
	    private String userName;
	      
	    private String password;
	    
	    private String email;
	    
        private Date createTime;
        
        private String photo;
        
        private Date modifiedTime;
        
        private Integer isDel;
        
        private String phone;
        
        private String sex;
        
        private Date birthday;
        
		public long getPkId() {
			return pkId;
		}

		public void setPkId(long pkId) {
			this.pkId = pkId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoto() {
			return photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}

		public Date getModifiedTime() {
			return modifiedTime;
		}

		public void setModifiedTime(Date modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public Integer getIsDel() {
			return isDel;
		}

		public void setIsDel(Integer isDel) {
			this.isDel = isDel;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		

}
