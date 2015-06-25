package cn.com.sy.constants;

public enum ErrorCode {

	    VALIDATE_ERROR(10001,"验证码不正确"),
	    EMAIL_EXIST(10002,"手机号已经注册过了，请直接登录"),
	    USER_LOGIN_ERROR(10003,"用户名不存在或密码错误"),
	    USER_MODIFYED_ERROR(10004,"修改密码失败"),
	    EMAIL_EXIST_ERROR(10005,"用户邮箱已存在"),
	    ADD_USER_NAME_ERROR(10006,"用户名已存在"),
	    UPDATE_USER_INFO_ERROR(10007,"更新用户信息失败"),
	    ACCESS_TOKEN_INVALIDATE(10008,"不合法的token"),
	    EMAIL_SEND_UN_AUTHENTICATION(10009,"邮箱未开启SMTP服务"),
	    ;
	    
	    
	    
	    private int errorCode;
	 	private String message;
	 	 
	 	private ErrorCode(int errorCode, String message) {
			this.errorCode = errorCode;
			this.message = message;
		}
	 	 
		public int getErrorCode() {
			return errorCode;
		}
		public void setErrorCode(int errorCode) {
			this.errorCode = errorCode;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	    
		public static void main(String[] args) {
			
			System.out.println(ErrorCode.VALIDATE_ERROR.getMessage());
			
		}
	 	 
}
