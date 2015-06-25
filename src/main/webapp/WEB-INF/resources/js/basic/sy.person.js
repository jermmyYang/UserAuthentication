;
(function(){

	$("#modify").click(function() {

		$(".mainnav li").eq(1).addClass("current").siblings().removeClass("current");
		
		var leftHtml = sy.template.getLeftSafeMunu();
		   
	    $(".aside").html(leftHtml);
		
		$("#modifyDialog").show();
		
		$("#in_modify").click(function(){
			$("#modifyDialog").show();
		});
		
		$("#in_setEmail").click(function(){
			  $("#emailDialpg").show();
		});

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
				};

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
					window.location.reload();
			  });
			  
			  uploader.start();
		  }
		  
		
	});
	
	$("#exist").click(function(){
		   window.location.href = sy.urls.LOGOUT_URL;
	});
	
	$("#setEmail").click(function(){
		   
          $(".mainnav li").eq(1).addClass("current").siblings().removeClass("current");
		
		  var leftHtml = sy.template.getLeftSafeMunu();
		   
	      $(".aside").html(leftHtml);
		
		   $("#emailDialpg").show();
	});
	
	$("#bindEmail").click(function(){
		
		   var email = $("#email").val();
		   
		   if(sy.validateEmail(email)){
			   
			   $("#error_email").text("");
			   
			   var url = sy.urls.SEND_EMAIL;
			   
			   var params = {
					   "email":email
			   };
			   sy.globalAjax(url, params, "POST", function(data) {

					if (data.status == 10005 || data.status == "10005") {
						$("#error_email").text("邮箱已经存在");
					} 
					else if(data.status==10009){
						$("#error_email").text("请开通邮箱的SMTP服务");
					}
					else{
						$("#error_email").text("邮件发送，请登录邮箱激活");
					}
					
				});
			   
		   }else{
			   $("#error_email").text("请输入正确的邮箱地址");
		   }
		
		
	});
	
	
	$("#setName").click(function(){
		
		   $(".mainnav li").eq(2).addClass("current").siblings().removeClass("current");
		
		   var leftHtml = sy.template.getLeftInfoMenu();
		   
		   $(".aside").html(leftHtml);
		 
		   var html = sy.template.getUserNameTemplate();
		   
		    $("#inner-content").show().html(html);

		    var userName = $("#userName");
		    
		    if(userName.length!=0){
		    	
		    	 var existName = userName.text();
		    	 $("#nickname").val(existName);
		    }
			saveNickName();
			
			$("#modify_img").click(function() {

			    $("#inner-content").hide();
			    $("#uploadDiv").show();
		  });
			
		  $("#info_li_list li").click(function(){
			  
			     $(this).addClass("current").siblings().removeClass("current");
			  
		  });
		  
		  $("#in_modifyInfo").click(function(){
			  $("#uploadDiv").hide();
			  getInfoHtml();
		  });
			
		
	});
	
function saveNickName(){
		
		$("#saveBtn").click(function(){
			
			var name = $("#nickname").val();
			
			var flag = validateName(name);
			
			if(flag){
				
				var url = sy.urls.SET_USERNAME_URL;
				
				var params = {
						"userName":name
				};
				
				sy.globalAjax(url, params, "POST", function(data){
					
					  if(data.status==10006){
						  $("#quc_error").text(sy.errorMessage.USER_EXIST);
						  $("#quc_wrapper").show();
					  }
					  else{
						  window.location.reload();
					  }
					
				});
				
			}
		
		});
		
	};
	
	
	$("#modifyInfo").click(function(){
		
		   $(".mainnav li").eq(2).addClass("current").siblings().removeClass("current");
			
		   var leftHtml = sy.template.getLeftInfoMenu();
		   
		   $(".aside").html(leftHtml);
		
		   getInfoHtml();
		  
		  $("#modify_img").click(function() {

			    $("#inner-content").hide();
			    $("#uploadDiv").show();
		});
		  
		  $("#in_modifyInfo").click(function(){
			  $("#uploadDiv").hide();
			  getInfoHtml();
		  });
		  
		  $("#info_li_list li").click(function(){
			  
			     $(this).addClass("current").siblings().removeClass("current");
			  
		  });
		 
	});
	
	function getInfoHtml(){
		
		
		 var html = sy.template.getUserInfoTemplate();
		  $("#inner-content").show().html(html);
		  
		  var option = {
				    format: 'yyyy-mm-dd',
			        weekStart: 1,
			        autoclose: true,
			        todayBtn: 'linked',
			        language: 'zh-CN'  
		  };
		
		  sy.getDatePicker("date", option);
		  var sex = $("#h_s");
		  
		  if(sex.length!=0){
			  
			  var b = $("#h_b").text();
			  
			  $("#date").val(b);
			  
			  if(sex==1 || sex=="1"){
				  $(".v .radio").first().attr("checked","checked");
			  }
			  else{
				  $(".v .radio").last().attr("checked","checked");
			  }
		  }
		  
		  saveInfo();
		
	}
	
	function saveInfo(){
		
		  $("#saveInfo").click(function(){
			  
			    var sex = $(".v .radio:checked").val();
			    
			    var birthday = $("#date").val();
			    
			    var url = sy.urls.UPDATE_USER_INFO;
			    
			    var params = {
			    		"sex":sex,
			    		"birthday":birthday
			    };
			    
			    sy.globalAjax(url, params, "POST", function(data){
			    	
			    	if(!data.status){
			    		window.location.reload();
			    	}
			    	
			    });
			  
		  });
		
	}
	
	
     function validateName(name){
    	 
    	   var errorDom = $("#quc_error");
    	   var wrapper = $("#quc_wrapper");
    	   
    	   if(name==""){
    		   errorDom.text(sy.errorMessage.USER_NAME_NULL);
    		   wrapper.show();
    		   return false;
    	   }
    	   else{
    		   
    		   if(name.length<2 || name.length>14){
    			   errorDom.text(sy.errorMessage.USER_NAME_UNLEGALCHARACTER);
    			   wrapper.show();
    			   return false;
    		   }
    		   else{
    			   
    			   if(!sy.isLegalCharacter(name)){
    				   errorDom.text(sy.errorMessage.USER_NAME_UNLEGALCHARACTER);
        			   wrapper.show();
        			   return false;
    			   }
    			   else{
    				   wrapper.hide();
    				   return true;
    			   }
    		   }
    	   }    	 
    	 
     }
	  
     $("#safeBtn").click(function(){
    	 
    	 $(".mainnav li").eq(1).addClass("current").siblings().removeClass("current");
 		
 		 var leftHtml = sy.template.getLeftSafeMunu();
 		   
 	     $(".aside").html(leftHtml);
 	     
 	    $("#in_modify").click(function(){
			$("#modifyDialog").show();
		});
		
		$("#in_setEmail").click(function(){
			  $("#emailDialpg").show();
		});
    	 
     });
     
     
     $("#accountBtn").click(function(){
    	 
    	   $(".mainnav li").eq(2).addClass("current").siblings().removeClass("current");
			
		   var leftHtml = sy.template.getLeftInfoMenu();
		   
		   $(".aside").html(leftHtml);
		   
		   $("#inner-content").hide();
		   
		   $("#uploadDiv").show();
		   
		   $("#in_modifyInfo").click(function(){
			      $("#uploadDiv").hide();
				  getInfoHtml();
			});
    	   
			
			$("#modify_img").click(function() {

			    $("#inner-content").hide();
			    $("#uploadDiv").show();
		  });
			
		  $("#info_li_list li").click(function(){
			  
			     $(this).addClass("current").siblings().removeClass("current");
			  
		  });
		   
     });
     
	
	
}());