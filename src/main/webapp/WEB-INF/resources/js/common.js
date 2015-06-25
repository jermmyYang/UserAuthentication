(function(){
	
	
	
	
	
	
	
	
}()); 

$("#modify").click(function() {

			$("#modifyDialog").show();

		});

		$("#closeDialog").click(function(){
			$("#modifyDialog").hide();
		});
		
        $("#modify_psw").click(function(){
        	
        	  var password = $("#password").val();
        	  
        	  var passwordAgain = $("#passwordAgain").val();
        	  
        	  var errorMessage =  $("#error_message");
        	  
        	  if(password=="" || password==null){
        		  
        		  errorMessage.text("请输入密码");
        		  return;
        	  }
        	  if(password.length<6 || password.length>20){
        		  errorMessage.text("请输入6-20位字符");
        		  return;
        	  }
        	  
        	  if(passwordAgain=="" || passwordAgain==null ||passwordAgain!=password){
        		  errorMessage.text("两次密码不一致");
        		  return;
        	  }
        	  
        	  errorMessage.text("");
        	  
        	  var params = {
        			  "userId":$("#userId").val(),
        			  "password":password
        	  }
        	  
        	  var url = sy.urls.USER_MODIFIED_URL;
        	  
        	  sy.globalAjax(url, params, "POST", function(data) {

					if(data.status==10004 || data.status=="10004"){
						errorMessage.text("修改密码失败").show();
					}
					else{
						errorMessage.text("");
						$("#modifyDialog").hide();
					}
				});
        	
        });
        
        
        $("#pageFresh").click(function(){
        	window.location.reload();
        })