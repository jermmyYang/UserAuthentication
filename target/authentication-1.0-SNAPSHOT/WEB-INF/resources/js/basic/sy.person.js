;
(function(){

	$("#modify").click(function() {

		$("#modifyDialog").show();

	});

	$("#closeDialog").click(function() {
		$("#modifyDialog").hide();
	});

	$("#closeEmailDialog").click(function(){
		$("#emailDialpg").hide();
	});
	
	$("#modify_psw").click(function() {

				var password = $("#password").val();

				var passwordAgain = $("#passwordAgain").val();

				var errorMessage = $("#error_message");

				if (password == "" || password == null) {

					errorMessage.text("请输入密码");
					return;
				}
				if (password.length<6 || password.length>20) {
					errorMessage.text("请输入6-20位字符");
					return;
				}

				if (passwordAgain == "" || passwordAgain == null
						|| passwordAgain != password) {
					errorMessage.text("两次密码不一致");
					return;
				}

				errorMessage.text("");

				var params = {
					"userId" : $("#userId").val(),
					"password" : password
				}

				var url = sy.urls.USER_MODIFIED_URL;

				sy.globalAjax(url, params, "POST", function(data) {

					if (data.status == 10004 || data.status == "10004") {
						errorMessage.text("修改密码失败").show();
					} else {
						errorMessage.text("");
						$("#modifyDialog").hide();
					}
				});

			});

	$("#pageFresh").click(function() {
		window.location.reload();
	});

	$("#modify_img").click(function() {

		    $("#logList").hide();
		    $("#uploadDiv").show();
		
	});
	
	
	var option = {
			selectBtn:"fileBtn",
			url:sy.urls.IMG_UPLAD_URL,
			length:1
	};
	
	var uploader = sy.upload.getUploadInstance(option);
	
	
	$("#uploadBtn").click(function(){
		  
		  if(uploader.files.length!=0){
			  
			  sy.upload.filesUploadSuccessEvent(uploader,function(){
					window.location.reload()
			  });
			  
			  uploader.start();
		  }
		  
		
	});
	
	$("#exist").click(function(){
		   window.location.href = sy.urls.LOGOUT_URL;
	});
	
	$("#setEmail").click(function(){
		   console.log("sdfdsf");
		   $("#emailDialpg").show();
		
	});
	
	$("#bindEmail").click(function(){
		
		   var email = $("#email").val();
		   
		   if(sy.validateEmail(email)){
			   
			   $("#error_email").text("");
			   
			   var url = sy.urls.SEND_EMAIL;
			   
			   var params = {
					   "email":email
			   }
			   sy.globalAjax(url, params, "POST", function(data) {

					if (data.status == 10005 || data.status == "10005") {
						$("#error_email").text("邮箱已经存在");
					} 
					else{
						$("#error_email").text("邮件发送，请登录邮箱激活");
					}
					
				});
			   
		   }else{
			   $("#error_email").text("请输入正确的邮箱地址");
		   }
		
		
	});
	
	
}());