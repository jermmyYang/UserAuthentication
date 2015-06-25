<!DOCTYPE html>
<!-- saved from url=(0064)http://i.360.cn/login?src=pcw_i360&destUrl=http%3A%2F%2Fi.360.cn -->
<html>
<!--<![endif]-->
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="renderer" content="webkit">


<title>登录-个人中心</title>


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

 <style type="text/css">
.quc-panel{

background-color:#fff;
box-shadow:2px 2px 10px rgba(0,0,0,.3);
margin:0;
min-width:200px;
padding:0;
left:110px;

}

</style> 

</head>

<body style="height: 648px;" class="login-body">

	<div id="doc">
		<!--通用头部-->

		<div id="hd" class="clearfix" style="padding-top: 96px;">
			<div class="">
			</div>
		</div>
		<!--内容部分-->

		<div class="info" style="margin-top: 132px;" style="display:none;">
			<!--<span><a target="_blank" href="http://baoxian.360.cn?from=i360">360健康计划</a><i class="hot"></i></span>-->

			 <span><a class="registerNew"
				id="register" href="javascript:void(0);">注册新帐号</a></span>
			<span class="split">|</span>
			<span id="otherLogin" style="font-size:16px;cursor:pointer;">弹框登录</span>
		</div>
		<div id="quc-bd" class="quc-clearfix reg-wrapper11">
			<div class="content">
				<div class="uc-logincode">
					<a href="javascript:void(0);" class="btn-code" id=""
						style="display: block;" title="扫码安全登录"></a>
				</div>
				<div id="loginWrap">
					<div class="mod-qiuser-pop quc-qiuser-panel">
						<div class="login-wrapper quc-wrapper quc-page">
							<div class="quc-mod-sign-in quc-mod-normal-sign-in">
								<div class="quc-tip-wrapper">
									<p class="quc-tip" style="color:red;display:none;" id="error"></p>
								</div>
								<div class="quc-main">
									<form class="quc-form">
										<div class="quc-ipbox">
											<p
												class="quc-field quc-field-account quc-input-long botborder">
												<label class="quc-label" for="quc_account_931198625">帐号：</label><span
													class="quc-input-bg"><input
													class="quc-input quc-input-account" type="text"
													name="account" placeholder="手机号/用户名/邮箱" autocomplete="off"
													id="account"></span>
											</p>
											<p class="quc-field quc-field-password quc-input-long">
												<label class="quc-label" for="quc_password_931198626">密码：</label><span
													class="quc-input-bg"><input
													class="quc-input quc-input-password" type="password"
													name="password" maxlength="20" placeholder="输入您的密码或动态密码"
													id="password"></span>
											</p>
										</div>
										<p class="quc-field quc-field-keep-alive">
											<a
												class="quc-link quc-link-about quc-link-about-normal quc-findPwd"
												href="http://i.360.cn/findpwd/?account=13524937324"
												target="_blank">忘记密码？</a><label><input
												class="quc-checkbox quc-checkbox-keep-alive" type="checkbox"
												name="iskeepalive" checked="checked">下次自动登录</label>
										</p>
										<p class="quc-field quc-field-submit">
											<input type="button" value="登录"
												class="quc-submit quc-button quc-button-sign-in" id="login">
										</p>
										 <p class="quc-field quc-field-third-part">
											<span>其他帐号登录：</span><span class="quc-third-part"><a
												href="javascript:void(0);"
												class="quc-third-part-icon quc-third-part-icon-sina"
												title="授权登录" id="oauth_login"></a></span>
										</p> 
									</form>
								</div>
								<!-- <div class="quc-footer" style="display: none;">
									<a class="quc-link quc-link-grey quc-link-normal-sign-in"
										href="http://i.360.cn/login?src=pcw_i360&destUrl=http%3A%2F%2Fi.360.cn#">使用其他帐号登录</a>
								</div> -->
							</div>
						</div>
					</div>
					<div class="otherMessage clearfix" style="display: block;">
						<a hidefocus="true"
							href="http://i.360.cn/findpwd/customerhelper#dynamicPassword"
							target="_blank">什么是动态密码？</a>
					</div>
				</div>

			</div>
		</div>


   <div class="quc-panel quc-wrapper" id="loginDialog"
		style="top: 200px;text-align:center; display: none;width:400px;height:300px;z-index:1000;position: Absolute;">
		<div class="quc-panel-hd">
			<div class="quc-panel-title">登录</div>
			<a href="javascript:void(0);" class="quc-panel-close"
				id="closeDialog"><i>关闭</i></a>
		</div>
		<div class="quc-panel-bd" style="margin-top:20px;">
			<div class="quc-mod-modify-password">
				<p class="quc-tip" id="error_message" style="color: red;"></p>
				<form class="quc-form">
					<p class="quc-field quc-input-long">
						<label class="quc-label" for="quc_password_9129525">账户</label><span
							class="quc-input-bg"><input type="text"
							class="quc-input quc-input-password"
							placeholder="请输入账户名" id="login_name"></span>
					</p>
					<p class="quc-field quc-input-long" style="margin-top: 10px;">
						<label class="quc-label" for="quc_passwordAgain_9129526">密码</label><span
							class="quc-input-bg"><input type="password"
							 class="quc-input  quc-input-passwordAgain"
							placeholder="请输入密码" id="login_pwd"></span>
					</p>
					<p class="quc-field" style="margin-top: 20px;">
						<input class="quc-submit quc-button quc-button-sign-in"
							value="登录" type="button" id="login_">
					</p>
				</form>
			</div>
		</div>
		<!--[if lte IE 6]><iframe class="quc-ie6-iframe" src="about:blank" border="0" frameborder="0"></iframe><![endif]-->
	</div>

		<!--公共需要的全局变量-->


		<script type="text/javascript">
		
		
			$("#login").click(function() {

				var account = $("#account").val().trim();
				var password = $("#password").val().trim();
				
				if(account == "" || account==null){
					$("#error").text("请输入帐号").show();
					return;
				}
				else{
					
					if(password=="" || password==null){
						$("#error").text("请输入密码").show();
						return;
					}
					else{
						$("#error").hide();
						
						var url = sy.urls.LOGIN_URL;

						var params = {
								"account":account,
								"password":password
								
						};
						sy.globalAjax(url, params, "POST", function(data) {

							if(data.status==10003 || data.status=="10003"){
								$("#error").text("用户名不存在或密码错误").show();
							}
							else{
								window.location.href = "/authentication/get/person/";
							}
						});
						
						
					}
					
				}
				
			});
			
			$(document).keydown(function(e){
				
				if(e.keyCode==13){
					$("#login").trigger("click");
				}
				
			});
			
			
			$("#register").click(function(){
				window.location.href= sy.urls.GET_REGISTER_PAGE;
			});
			
			$("#otherLogin").click(function(){
				    
				  $("#loginDialog").show();
				
			});
			
			
			$("#closeDialog").click(function(){
				$("#loginDialog").hide();
				clearData();
			});
			
			$("#login_").click(function(){
				
				var account = $("#login_name").val().trim();
				var password = $("#login_pwd").val().trim();
				
				if(account == "" || account==null){
					$("#error_message").text("请输入帐号").show();
					return;
				}
				else{
					
					if(password=="" || password==null){
						$("#error_message").text("请输入密码").show();
						return;
					}
					else{
						$("#error_message").hide();
						
						var url = sy.urls.LOGIN_URL;

						var params = {
								"account":account,
								"password":password
						};
						sy.globalAjax(url, params, "POST", function(data) {

							if(data.status==10003 || data.status=="10003"){
								$("#error_message").text("用户名不存在或密码错误").show();
							}
							else{
								window.location.href = "/authentication/get/person/"+data;
							}
						});
						
					}
					
				}
				
			});
			
			function clearData(){
				$("#error_message").text("");
			};
			
			
			$("#oauth_login").click(function(){
				   
				window.open(sy.urls.GET_AUTHORIZE_PAGE+"?redirect_url=http://baidu.com&client_id=mobile_client&grant_type=password")
				
			});
			
			
		</script>


</body>
</html>