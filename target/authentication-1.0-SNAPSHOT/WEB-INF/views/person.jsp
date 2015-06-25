<!DOCTYPE html>
<!-- saved from url=(0058)http://i.360.cn/?sb_param=af6b7b2e55a5f7212139b1ef076a2141 -->
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
<title>个人中心-首页</title>


<meta name="Keywords" content="360个人中心">
<meta name="Description" content="360个人中心">
<!--公共的样式-->

<link rel="stylesheet"
	href="http://i.360.cn/static/css/import/base.css?v=2abc9.css">
<!--页面自定义样式-->

<link rel="stylesheet" href="${ctx }/resources/css/basic.css">

<link rel="stylesheet"
	href="http://i.360.cn/static/css/import/index.css?v=ddf13.css">

</head>

<body style="height: 636px;">
	<!--通用顶部导航开始-->
	<input type="hidden" id="userId" value="${user.pkId}">
	<div id="hd">
		<div class="uc-header">
			<h1 class="logo">
				<a href="javascript:void(0);" title="360个人中心"></a>
			</h1>
			<div class="nav-login">
				<ul>
					<li><a href="javascript:void(0);" title="设置用户名" class="lnk">未设置用户名</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
						href="javascript:void(0);" title="退出个人中心" class="lnk sign-out" id="exist">退出</a></li>
					<li class="divider">|</li>
					<li><a href="javascript:void(0);" title="360安全中心"
						target="_blank">360首页&gt;&gt;</a></li>
				</ul>
			</div>
		</div>
		<div class="uc-nav">
			<div class="nav">
				<ul class="mainnav">
					<li class="current"><a href="javascript:void(0);"
						id="pageFresh">首页</a></li>
					<li><a href="javascript:void(0);">帐号安全</a></li>
					<li><a href="javascript:void(0);">帐号信息</a></li>
					<li><a href="javascript:void(0);">帮助中心</a></li>
				</ul>
				<div class="nav-ag-baoxian none"
					style="position: absolute; top: -14px; right: 0">
					<a href="javascript:void(0);" target="_blank">&nbsp;&nbsp;</a>
				</div>
				<div class="nav-ag" style="position: absolute; top: -14px; right: 0">
					<a href="javascript:void(0);" target="_blank">&nbsp;&nbsp;</a>
				</div>
			</div>

		</div>
	</div>
	<!--通用顶部导航结束-->


	<div id="doc3">

		<div id="bd">
			<div class="grid-1 clearfix">
				<div class="aside">
					<div class="u-info">
						<div class="u-main">
							<div class="avatar avatar-hover">
								<a class="avatar-img" href="javascript:void(0);"> 
								<c:if test="${not empty user.photo}">
								<img src="${ctx}/${user.photo}">
								</c:if>
								<c:if test="${empty user.photo || user.photo==''}">
								<img src="${ctx}/resources/img/defaultPersion.jpg">
								</c:if>
								</a> <a class="change" href="javascript:void(0);" id="modify_img">修改头像</a>
							</div>
							<div class="txt">
								<h2>${user.phone}</h2>
								<p>
									<a href="javascript:void(0);" class="lnk">设置昵称</a>
								</p>
								<p>
									<a href="javascript:void(0);" class="lnk">修改个人资料</a>
								</p>
							</div>
						</div>
						<div class="u-detail">
							<h3>最近一次登录：</h3>
							<p>
								<c:if test="${not empty logs.records}">
									<fmt:formatDate value="${logs.records[0].loginTime}"
										type="both" />
								</c:if>
							</p>
						</div>
					</div>
					<div class="aside-mod">
						<div class="aside-hd clearfix">
							<h2>常用操作</h2>
						</div>
						<div class="aside-bd">
							<ul class="operation-list">
								<li>
									<h3>
										<i class="ico ico-psw"></i> 登录密码
									</h3>
									<p>
										<span class="fr"><a href="javascript:void(0);"
											id="modify" class="lnk">修改</a></span> 定期修改密码能保护帐号安全
									</p>
								</li>
								<li>
									<h3>
										<i class="ico ico-email"></i> 登录邮箱
									</h3>
									<p>
									<c:if test="${empty user.email}">
										<span class="fr"><a href="javascript:void(0);"
											class="lnk" id="setEmail">设置</a></span> <em class="orange">未设置</em>
									</c:if>
									<c:if test="${not empty user.email}">
										<span class="fr"> <em class="orange">${user.email}</em>
									</c:if>
									</p>
								</li>
								<li>
									<h3>
										<i class="ico ico-phone"></i> 绑定手机：
									</h3>
									<p>
										<span class="fr"><a href="javascript:void(0);"
											class="lnk">修改</a></span> 135*****324
									</p>
								</li>
							<!-- 	<li>
									<h3>
										<i class="ico ico-guard"></i> 帐号卫士：
									</h3>
									<p>
										<span class="fr"><a href="javascript:void(0);"
											class="lnk" target="_blank">绑定</a></span> <em class="orange">未绑定</em>
									</p>
								</li> -->
							</ul>
						</div>
					</div>
					<div class="aside-mod">
						<div class="aside-hd clearfix">
							<h2>快捷入口</h2>
						</div>

					</div>
				</div>

				<div class="article" id="content">

					<div class="art-mod mod-2" id="logList">
						<div class="art-hd clearfix">
							<h2>登录记录</h2>
						</div>
						<div class="art-bd">
							<div class="log-record">
								<table class="table1" width="100%">
									<thead>
										<tr>
											<th>日期</th>
											<th>时间</th>
											<th>IP</th>
											<th>城市</th>
											<th>登录产品</th>
										</tr>
									</thead>
									<tbody>
										<c:if test="${not empty logs.records}">
											<c:forEach var="log" items="${logs.records}"
												varStatus="status">
												<tr class="orange">
													<td><fmt:formatDate value="${log.loginTime}"
															type="date" dateStyle="full" /></td>
													<td><fmt:formatDate value="${log.loginTime}"
															type="time" timeStyle="short" /></td>
													<td>${log.logIp }</td>
													<td>上海市</td>
													<td>360个人中心</td>
												</tr>
											</c:forEach>
										</c:if>
									</tbody>
								</table>
							</div>
						</div>
					</div>


					<div class="photo clearfix" id="uploadDiv" style="display: none;">
						<div class="photol">
						       <c:if test="${not empty user.photo}">
						       <img id="headimg" src="${ctx}/${user.photo}"
								width="180" height="180">
								</c:if>
								<c:if test="${empty user.photo || user.photo==''}">
								<img id="headimg" src="${ctx}/resources/img/defaultPersion.jpg"
								width="180" height="180">
								</c:if>
						</div>
						<div class="photor">
							<p class="iptp">
								<input type="button" value="浏览" id="fileBtn" class="iptbut">
							</p>
							<p class="text-tip">
								支持JPG、PNG、GIF图片类型，不能大于3M。推荐尺寸：180PX*180PX<br>
							</p>
							<p style="height: 30px;">
								<input type="button" value="上传图片" class="btn4" id="uploadBtn">
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!--公共需要的全局变量-->


	<div class="quc-panel quc-wrapper" id="modifyDialog"
		style="top: 200px; left: 307px; position: absolute; display: none;">
		<div class="quc-panel-hd">
			<div class="quc-panel-title">修改密码</div>
			<a href="javascript:void(0);" class="quc-panel-close closeDialog"
				id="closeDialog"><i>关闭</i></a>
		</div>
		<div class="quc-panel-bd">
			<div class="quc-mod-modify-password">
				<p class="quc-tip" id="error_message" style="color: red;"></p>
				<form class="quc-form">
					<p class="quc-field quc-input-long">
						<label class="quc-label" for="quc_password_9129525">新密码</label><span
							class="quc-input-bg"><input type="password"
							name="password" class="quc-input quc-input-password"
							placeholder="请输入新密码" id="password"></span>
					</p>
					<p class="quc-field quc-input-long">
						<label class="quc-label" for="quc_passwordAgain_9129526">确认密码</label><span
							class="quc-input-bg"><input type="password"
							name="passwordAgain" class="quc-input  quc-input-passwordAgain"
							placeholder="请再输入一遍新密码" id="passwordAgain"></span>
					</p>
					<p class="quc-field">
						<input class="quc-button quc-button-big quc-button-submit"
							value="提交" type="button" id="modify_psw">
					</p>
				</form>
			</div>
		</div>
		<!--[if lte IE 6]><iframe class="quc-ie6-iframe" src="about:blank" border="0" frameborder="0"></iframe><![endif]-->
	</div>

<div class="quc-panel quc-wrapper" id="emailDialpg"
		style="top: 200px; left: 307px; position: absolute; display: none;">
		<div class="quc-panel-hd">
			<div class="quc-panel-title"></div>
			<a href="javascript:void(0);" class="quc-panel-close closeDialog"
				id="closeEmailDialog"><i>关闭</i></a>
		</div>
		<div class="quc-panel-bd">
			<div class="quc-mod-modify-password">
				<p class="quc-tip" id="error_email" style="color: red;"></p>
				<form class="quc-form">
					<p class="quc-field quc-input-long">
						<label class="quc-label" for="quc_password_9129525">邮箱</label><span
							class="quc-input-bg"><input type="text"
							name="password" class="quc-input quc-input-password"
							placeholder="" id="email"></span>
					</p>
					<p class="quc-field">
						<input class="quc-button quc-button-big quc-button-submit"
							value="提交" type="button" id="bindEmail">
					</p>
				</form>
			</div>
		</div>
		<!--[if lte IE 6]><iframe class="quc-ie6-iframe" src="about:blank" border="0" frameborder="0"></iframe><![endif]-->
	</div>




	<script src="${ctx}/resources/js/jquery-1.8.3.min.js"></script>
	
	<script src="${ctx}/resources/js/basic/sy.js"></script>
	<script src="${ctx}/resources/js/basic/sy.url.js"></script>
	<script src="${ctx}/resources/js/plupload/moxie.js"></script>
    <script src="${ctx}/resources/js/plupload/plupload.dev.js"></script>
    <script src="${ctx}/resources/js/basic/sy.upload.js"></script>
    <script src="${ctx}/resources/js/basic/sy.person.js"></script>
   
</body>
</html>