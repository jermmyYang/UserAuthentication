(function(){
	
	   function ShangYu(option){
		     this.defaultOption = option || {};
	   }
	
	   ShangYu.prototype = {
			   
			   init:function(){
			   },
			   /**
			    *  ajax共用请求方法
			    *  @author Administrator
			    *  @param url
			    *  @param parmas
			    *  @Param method
			    *  @Param callback  回调
			    */
			   globalAjax:function(url,params,method,callback){
				   
				   var _response_data;
				   
				   $.ajax({
			            url: url,
			            type: method,
			            data: params,
			            dataType : "json",
			            success: function (data) {
			            	
			                _response_data = data;
			                
			                if(callback && $.isFunction(callback)){
			                	
			                	if(_response_data && typeof _response_data == "string"){
			                		_response_data = $.parseJSON(_response_data);
			                	}
			                	callback(_response_data);
			                }
			                
			            },
			            error: function (XMLHttpRequest, textStatus, errorThrown) {
			            	
			            		 //object.errorMessage = $.parseJSON(XMLHttpRequest.responseText);
			            		 _response_data = $.parseJSON(XMLHttpRequest.responseText);
			            		
			            		 if(callback && $.isFunction(callback)){
			                   	     callback(_response_data);
			                       }
			               
			            }
				   
				   
			   });
			   
	       },
	       /**
		    *  ajax共用请求页面方法
		    *  @author Administrator
		    *  @param url
		    *  @param parmas
		    *  @Param method
		    *  @Param callback  回调
		    */
	       globalAjaxGetPage:function(url,params,method,callback){
	    	   
	    	   var _response_data;
			   
			   $.ajax({
		            url: url,
		            type: method,
		            data: params,
		            contentType:"text/html",
		            traditional: true,
		            success: function (data) {
		            	
		                _response_data = data;
		                
		                if(callback && $.isFunction(callback)){
		                	callback(_response_data);
		                }
		                
		            },
		            error: function (XMLHttpRequest, textStatus, errorThrown) {
		            	
		            		 //object.errorMessage = $.parseJSON(XMLHttpRequest.responseText);
		            		 _response_data = $.parseJSON(XMLHttpRequest.responseText);
		            		
		            		 if(callback && $.isFunction(callback)){
		                   	     callback(_response_data);
		                       }
		               
		            }
			   });
			   
	    	   
	       },
	       
	       getCodeImg:function(imgUrl,callback){
	    	   
	    	     var xmlHTTP = new XMLHttpRequest();
				 
				 xmlHTTP.open('GET',imgUrl,true);
				 
				 xmlHTTP.responseType = 'blob';
				  
				 xmlHTTP.addEventListener( "load", function(){

					    var blob  = this.response;
					 
					    var dataUrl = window.URL.createObjectURL(blob);
				        
					    if(callback && $.isFunction(callback)){
                                  callback(dataUrl);					    	
					    }
					    
				        window.URL.revokeObjectURL(blob);
				     });
				    xmlHTTP.send(null);
	       },
	       
	       validateEmail:function(value){
	    	   
	    	   var emailReg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	    	   
	    	   if(emailReg.test(value)){
	    		   return true;
	    	   }
	    	   else{
	    		   return false;
	    	   }
	    	   
	    	   
	       },
	       /**
	        * @Param target 绑定的dom对象
	        * @Param validateObj  定义的规则
	        * @Param callback submit 回调函数
	        * 
	        */
	       formValidate:function(target,validateObj,callback){
	    	     
	    	        var rules  = validateObj.rules;
	    	        var messages = validateObj.messages;
	    	       $("#"+target).validate({
	    	    	    rules:rules,
	    	    	    messages:messages,
	    	    	    submitHandler:function(form){
	    	    	    	alert("adsdfdsf");
	    	    	    	callback();
	    	    	    }
	    	         }
	    	       );
	    	   
	       },
	       
	       isPhone:function(value){
	    	   
	    	   var phoneReg = /^1[3|4|5|8][0-9]\d{4,8}$/;
	    	   
	    	   return phoneReg.test(value);
	    	   
	       }
	       
	       
	   }
	   
	   
	   window.sy = new ShangYu();
	
}());