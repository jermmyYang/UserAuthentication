;
/**
 * 登录页面js
 * 
 */
$(function(){
	
	
        $.ajaxSetup({ cache: false });
        
        $("#password").keyup(function(e){
            if(e.keyCode == 13){
                $('#login').click();
            }
        });
        
        $("#register").click(function(){
        	   
                var url = sy.urls.GET_REGISTER_PAGE;
  
        	    sy.globalAjaxGetPage(url,{},"POST",function(data){
        	    	
        	    	   $(".login-body").html(data);
        	    	
        	    });
        	
        });
        
        $("#getCode").click(function(){
        	
        	  var url = sy.urls.GET_CODE_URL;
        	  
        	  sy.getCodeImg(url,function(imgUrl){
        		  
        		  $("#codeImg").show().attr("src",imgUrl);
        	  });
        	
        });	
        
        var validateObj = new Object();
        
        validateObj.rules = {
        		email:{
        			required:true,
        			email:true
        		},
        		code:{
        			required:true
        		},
        		userName:{
        			required:true
        		},
        		password:{
        			required:true,
        			minLength:6
        		},
        		confirPassword:{
        			required:true,
        			minLength:6,
        			equalTo:"#password"
        		}
        }
        
        validateObj.messages = {
        		email:{
        			required:"请输入正确的邮箱地址"
        		},
        		code:{
        			required:"请输入验证码",
        		},
        		userName:{
        			required:"请输入用户名",
        		},
        		password:{
        			required:"请输入密码",
        			minLength:"密码不能小于6位"
        		},
        		confirPassword:{
        			equalTo:"两次输入的密码不一致",
        			minLength:"密码不能小于6位",
        			required:"请确认密码"
        		}
        }
        
        sy.formValidate("registerForm",validateObj);
        
        
        $("#email").blur(function(){
        	
        	var email = $(this).val();
        	
        	if(sy.validateEmail(email)){
        		
        		  var url = sy.urls.GET_CODE_URL;
            	  
            	  sy.getCodeImg(url,function(imgUrl){
            		  
            		  $("#codeImg").show().attr("src",imgUrl);
            	  });
            	  $("#getCode").show();
        		
        	}
        	else{
        		$("#codeImg").hide();
        		$("#getCode").hide();
        	}
        	
        }).mailAutoComplete(function(){
        	
        	hintText: "请输入邮箱"
        	
        });
        
        
        
        $('#login').click(function(){
            $('#username_span').html('');
            $('#password_span').html('');
            $('#login_span').html('');
            var username = $.trim($('#username').val());
            if(username == ''){
                $('#username_span').html('Username was invalid');
                $('#username').focus();
                return false;
            }
            var password = $.trim($('#password').val());
            if(password == ''){
                $('#password_span').html('Password was invalid');
                $('#password').focus();
                return false;
            }

            var param = {
            	"userName":username,
            	"password":password
            }
            
            var url = sy.urls.LOGIN_URL;
            
            sy.globalAjax(url,param,"POST",function(data){
            	
            	  if(data.status){
            		   $("#user_login").after("<span style='color:red;margin-left:30px;'>用户名不存在或者密码不正确</span>");
            	  }
            	
            });
            
            return false;
        });
        
        
        
        
        
	
	
	
	
});