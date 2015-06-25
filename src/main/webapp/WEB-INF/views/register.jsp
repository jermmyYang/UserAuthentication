<!DOCTYPE html>
<!-- saved from url=(0062)http://i.360.cn/reg?src=pcw_i360&destUrl=http%3A%2F%2Fi.360.cn -->
<html>
<!--<![endif]-->
<head>
<%@ page contentType="text/html; charset=UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<meta charset="utf-8">
<meta name="renderer" content="webkit">
<title>注册-360个人中心</title>


<meta name="Keywords" content="360个人中心">
<meta name="Description" content="360个人中心">
<!--公共的样式-->

<script src="${ctx }/resources/js/jquery-1.8.3.min.js"></script>
<script src="${ctx }/resources/js/basic/sy.js"></script>
<script src="${ctx }/resources/js/basic/sy.url.js"></script>

<link rel="stylesheet"
	href="http://i.360.cn/static/css/import/base.css?v=2abc9.css">
<!--页面自定义样式-->


<link rel="stylesheet"
	href="http://i.360.cn/static/css/import/uc_login_reg.css?v=0a4ad.css">

</head>

<body style="height: 867px;">

	<div id="doc">
		<!--通用头部-->

		<div id="hd" class="clearfix" style="padding-top: 96px;">
		</div>
		<!--内容部分-->

		<div class="info" style="margin-top: 132px;">
			<!--<span><a target="_blank" href="http://baoxian.360.cn?from=i360">360健康计划</a><i class="hot"></i></span>-->

			<span><a href="/authentication"
				class="reg2login">已有帐号</a></span>
		</div>
		<div id="quc-bd" class="quc-clearfix reg-wrapper2">
			<!--
	<div class="reg-nav">
		<ul id="regWays" class="quc-clearfix">
			<li class="cur mobile-sign-up"><a href="#" hidefocus="true"><i class="icon tel-icon"></i>手机注册</a></li>
			<li class="ncur email-sign-up"><a href="#" hidefocus="true"><i class="icon email-icon"></i>邮箱注册</a></li>
		</ul>
	</div>
	-->

			<div class="content">
				<div id="regWrap">
					<div class="quc-sign-up-wrapper quc-wrapper quc-page">
						<div class="quc-mod-sign-up quc-clearfix">
							<div class="quc-left-bar" style="display: none;">
								<ul class="quc-sign-up-type">
									<li class="quc-type-mobile quc-current"><a
										href="http://i.360.cn/reg?src=pcw_i360&destUrl=http%3A%2F%2Fi.360.cn#"><i
											class="quc-icon quc-icon-mobile"></i>手机注册</a></li>
									<li class="quc-type-email"><a
										href="http://i.360.cn/reg?src=pcw_i360&destUrl=http%3A%2F%2Fi.360.cn#"><i
											class="quc-icon quc-icon-email"></i>邮箱注册</a></li>
								</ul>
							</div>
							<div class="quc-main">
								<div class="quc-tip-wrapper quc-global-error">
									<p class="quc-tip quc-tip-error"></p>
								</div>
								<form class="quc-form" method="post" action="">
									<div>
										<div
											class="quc-field quc-field-mobile quc-input-middle quc-clearfix"
											style="margin-bottom: 10px; border-bottom: none;">
											<span class="quc-ipbox" style="display: block"><label
												class="quc-label" for="quc_account_930979981">手机号</label><span
												class="quc-input-bg"><input
													class="quc-input quc-input-mobile" type="tel"
													name="account" data-name="mobile" maxlength="11"
													id="account"></span><span
												class="tipwrapper-phoneReg msgtipsleft"
												style="top: 55px; left: 518px;" id="phone_error"><i
													class="ico ico-err-3"></i><span
													class="border-right msgtipsright"><span
														id="tips-phoneReg"
														class="text-tips tips-phoneReg reg-tips-wrong"><span
															class="quc-tip" data-default-tip="请输入您的手机号码 "
															id="phone_mesg">请输入您的手机号码 </span></span></span></span></span><a
												href="javascript:void(0);"
												class="quc-button quc-button-blue quc-get-sms-token"
												id="getCode">免费获取校验码</a><a class="quc-mobile-tip quc-link"
												href="javascript:void(0);" target="_blank" tabindex="99">校验码常见问题</a>
										</div>
										<div class="quc-ipbox">
											<div class="quc-field quc-field-sms-token quc-input-long">
												<label class="quc-label" for="quc_smscode_930979982">校验码</label><span
													class="quc-input-bg"><input
													class="quc-input quc-input-sms-token" type="text"
													name="smscode" data-name="smsToken" maxlength="6"
													id="smscode"></span><span
													class="tipwrapper-phoneReg errortipsleft" id="code_error"><i
													class="ico ico-err-3"></i><span
													class="border-right errortipsright" ><span
														id="tips-phoneReg"
														class="text-tips tips-phoneReg reg-tips-wrong"><span
															class="quc-tip" data-default-tip="请输入短信中6位数字校验码" id="code_message">请输入短信中6位数字校验码</span></span></span></span>
											</div>
											<div class="quc-field quc-field-password quc-input-long">
												<label class="quc-label" for="quc_password_930979983">密码</label><span
													class="quc-input-bg"><input
													class="quc-input quc-input-password" type="password"
													name="password" maxlength="20" id="password"></span><span
													class="tipwrapper-phoneReg errortipsleft" id="password_error"><i
													class="ico ico-err-3"></i><span
													class="border-right errortipsright" ><span
														id="tips-phoneReg"
														class="text-tips tips-phoneReg reg-tips-wrong"><span
															class="quc-tip" data-default-tip="6-20个字符(区分大小写)">6-20个字符</span></span></span></span>
											</div>
											<div
												class="quc-field quc-field-password-again quc-input-long">
												<label class="quc-label" for="quc_passwordAgain_930979984">确认密码</label><span
													class="quc-input-bg"><input
													class="quc-input quc-input-password-again" type="password"
													name="passwordAgain" maxlength="20" id="passwordAgain"></span><span
													class="tipwrapper-phoneReg errortipsleft" id="password_again_error"><i
													class="ico ico-err-3"></i><span
													class="border-right errortipsright"
													><span id="tips-phoneReg"
														class="text-tips tips-phoneReg reg-tips-wrong"><span
															class="quc-tip" data-default-tip="请再次输入密码" id="passwordAgain_message">请再次输入密码</span></span></span></span>
											</div>
										</div>
									</div>
									<p class="quc-field-submit">
										<input class="quc-button quc-button-sign-up" type="button"
											id="register" value="立即注册">
									</p>
									<p class="quc-field-licence">
										<label><input class="quc-checkbox" type="checkbox"
											name="is_agree" data-name="agreeLicence" checked="checked"><span
											style="font-size: 12px;">我已经阅读并同意<a
												class="quc-link green"
												href="http://i.360.cn/pub/protocol.html" target="_blank">《用户服务条款》</a></span></label>
									</p>
									<p class="quc-login" style="display: none;">
										已有帐号，<a href="javascript:void(0)"
											class="quc-link quc-link-login">立即登录</a>
									</p>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!--公共需要的全局变量-->



	<script type="text/javascript">
	
	
		$("#getCode").click(function() {
			
			var account = $("#account").val();

			var that = $(this);

			if (account == "" || account == null) {

				$("#phone_error").css("display", "inline")

			} else {

				if (!sy.isPhone(account)) {

					$("#phone_error").css("display", "inline");
					$("#phone_mesg").text("请输入正确的手机号")

				} else {
					$("#phone_error").css("display", "none");
					var url = sy.urls.GET_SMS_CODE;
					var params = {
						"mobile" : account
					}
					sy.globalAjax(url, params, "POST", function() {
						computeTime(that);
					});

				}

			}

		});

		function computeTime(that){
			
			that.text("120秒后请重试").attr("disabled", "true");
			
			var timer = 120;
			
			setInterval(function(){
				
				timer = timer-1;
				that.text(timer+"秒后请重试").attr("disabled", "true");
				
			},1000);
			
			setTimeout(function() {
				that.text("免费获取校验码").attr("disabled", "false");
			}, 120000);
			
		}
		
		function validate(){
			
			console.log("asd");
			var account = $("#account").val();

			var that = $(this);

			if (account == "" || account == null) {

				$("#phone_error").css("display", "inline")
				return false;
			} else {
				$("#phone_error").css("display", "none");
			}

			var code = $("#smscode").val();

			if (code == "" || code == null || code.length < 6) {
				$("#code_error").css("display", "inline");
				return false;
			} else {
				$("#code_error").css("display", "none");
			}

			var password = $("#password").val();

			if (password == "" || password == null
					|| password.length<6 || password.length>20) {
				$("#password_error").css("display", "inline");
				return false;
			}

			else {
				$("#password_error").css("display", "none");
			}

			var confirmPassword = $("#passwordAgain").val();

			if (confirmPassword == ""
					|| confirmPassword == null
					|| confirmPassword.length<6 
					|| confirmPassword.length>20
			){
				$("#password_again_error").css("display", "inline");
				return false;
			}
			else if(confirmPassword!=password){
				$("#passwordAgain_message").text("两次输入的密码不一致，请重新输入");
				return false;
			}
			else{
				$("#password_again_error").css("display", "none");
			}
				
			return true;
		}




		$("#register").click(function() {

							var flag = validate();
							
							if(flag){
								var url = sy.urls.USER_REGISTER;
					            
								var params = {
										"code":$("#smscode").val(),
										"mobile":$("#account").val(),
										"password":$("#password").val()
										
								}
								
					            sy.globalAjax(url,params,"POST",function(data){
					            	
					            	  if(data.status==10002 || data.status=="10002"){
					            		  $("#phone_error").css("display", "inline");
					  					  $("#phone_mesg").text("该手机号已经注册过了，请直接登录");
					            	  }
					            	  else if(data.status==10001 || data.status=="10001"){
					            		  $("#code_error").css("display", "inline");
					            		  $("#code_message").text("验证码不正确");
					            	  }
					            	  else{
					            		  window.location.href = "/authentication/get/person/"+data;
					            	  }
					            	
					            });
							}
							
							
							
	    });
	</script>




	<!--
<br>	6e84fadb576b6535	==	page_load
<br>	6e84fadb576b6535	==	page_load:0.015

-->
</body>
</html>