package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!-- saved from url=(0064)http://i.360.cn/login?src=pcw_i360&destUrl=http%3A%2F%2Fi.360.cn -->\n");
      out.write("<html>\n");
      out.write("<!--<![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>登录-个人中心</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta name=\"Keywords\" content=\"360个人中心\">\n");
      out.write("<meta name=\"Description\" content=\"360个人中心\">\n");
      out.write("<!--公共的样式-->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-1.8.3.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/basic/sy.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/basic/sy.url.js\"></script>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"http://i.360.cn/static/css/import/base.css?v=2abc9.css\">\n");
      out.write("<!--页面自定义样式-->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"http://i.360.cn/static/css/import/uc_login_reg.css?v=0a4ad.css\">\n");
      out.write("\n");
      out.write(" <style type=\"text/css\">\n");
      out.write(".quc-panel{\n");
      out.write("\n");
      out.write("background-color:#fff;\n");
      out.write("box-shadow:2px 2px 10px rgba(0,0,0,.3);\n");
      out.write("margin:0;\n");
      out.write("min-width:200px;\n");
      out.write("padding:0;\n");
      out.write("left:110px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style> \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"height: 648px;\" class=\"login-body\">\n");
      out.write("\n");
      out.write("\t<div id=\"doc\">\n");
      out.write("\t\t<!--通用头部-->\n");
      out.write("\n");
      out.write("\t\t<div id=\"hd\" class=\"clearfix\" style=\"padding-top: 96px;\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--内容部分-->\n");
      out.write("\n");
      out.write("\t\t<div class=\"info\" style=\"margin-top: 132px;\" style=\"display:none;\">\n");
      out.write("\t\t\t<!--<span><a target=\"_blank\" href=\"http://baoxian.360.cn?from=i360\">360健康计划</a><i class=\"hot\"></i></span>-->\n");
      out.write("\n");
      out.write("\t\t\t <span><a class=\"registerNew\"\n");
      out.write("\t\t\t\tid=\"register\" href=\"javascript:void(0);\">注册新帐号</a></span>\n");
      out.write("\t\t\t<span class=\"split\">|</span>\n");
      out.write("\t\t\t<span id=\"otherLogin\" style=\"font-size:16px;cursor:pointer;\">弹框登录</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"quc-bd\" class=\"quc-clearfix reg-wrapper11\">\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<div class=\"uc-logincode\">\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0);\" class=\"btn-code\" id=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"display: block;\" title=\"扫码安全登录\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"loginWrap\">\n");
      out.write("\t\t\t\t\t<div class=\"mod-qiuser-pop quc-qiuser-panel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"login-wrapper quc-wrapper quc-page\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"quc-mod-sign-in quc-mod-normal-sign-in\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"quc-tip-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"quc-tip\" style=\"color:red;display:none;\" id=\"error\"></p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"quc-main\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<form class=\"quc-form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"quc-ipbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"quc-field quc-field-account quc-input-long botborder\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"quc-label\" for=\"quc_account_931198625\">帐号：</label><span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"quc-input-bg\"><input\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"quc-input quc-input-account\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"account\" placeholder=\"手机号/用户名/邮箱\" autocomplete=\"off\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"account\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"quc-field quc-field-password quc-input-long\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"quc-label\" for=\"quc_password_931198626\">密码：</label><span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"quc-input-bg\"><input\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"quc-input quc-input-password\" type=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"password\" maxlength=\"20\" placeholder=\"输入您的密码或动态密码\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"password\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"quc-field quc-field-keep-alive\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"quc-link quc-link-about quc-link-about-normal quc-findPwd\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"http://i.360.cn/findpwd/?account=13524937324\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"_blank\">忘记密码？</a><label><input\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"quc-checkbox quc-checkbox-keep-alive\" type=\"checkbox\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"iskeepalive\" checked=\"checked\">下次自动登录</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"quc-field quc-field-submit\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"登录\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"quc-submit quc-button quc-button-sign-in\" id=\"login\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <p class=\"quc-field quc-field-third-part\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>其他帐号登录：</span><span class=\"quc-third-part\"><a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:void(0);\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"quc-third-part-icon quc-third-part-icon-sina\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttitle=\"授权登录\" id=\"oauth_login\"></a></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p> \n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <div class=\"quc-footer\" style=\"display: none;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"quc-link quc-link-grey quc-link-normal-sign-in\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"http://i.360.cn/login?src=pcw_i360&destUrl=http%3A%2F%2Fi.360.cn#\">使用其他帐号登录</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div> -->\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"otherMessage clearfix\" style=\"display: block;\">\n");
      out.write("\t\t\t\t\t\t<a hidefocus=\"true\"\n");
      out.write("\t\t\t\t\t\t\thref=\"http://i.360.cn/findpwd/customerhelper#dynamicPassword\"\n");
      out.write("\t\t\t\t\t\t\ttarget=\"_blank\">什么是动态密码？</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <div class=\"quc-panel quc-wrapper\" id=\"loginDialog\"\n");
      out.write("\t\tstyle=\"top: 200px;text-align:center; display: none;width:400px;height:300px;z-index:1000;position: Absolute;\">\n");
      out.write("\t\t<div class=\"quc-panel-hd\">\n");
      out.write("\t\t\t<div class=\"quc-panel-title\">登录</div>\n");
      out.write("\t\t\t<a href=\"javascript:void(0);\" class=\"quc-panel-close\"\n");
      out.write("\t\t\t\tid=\"closeDialog\"><i>关闭</i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"quc-panel-bd\" style=\"margin-top:20px;\">\n");
      out.write("\t\t\t<div class=\"quc-mod-modify-password\">\n");
      out.write("\t\t\t\t<p class=\"quc-tip\" id=\"error_message\" style=\"color: red;\"></p>\n");
      out.write("\t\t\t\t<form class=\"quc-form\">\n");
      out.write("\t\t\t\t\t<p class=\"quc-field quc-input-long\">\n");
      out.write("\t\t\t\t\t\t<label class=\"quc-label\" for=\"quc_password_9129525\">账户</label><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"quc-input-bg\"><input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"quc-input quc-input-password\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"请输入账户名\" id=\"login_name\"></span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"quc-field quc-input-long\" style=\"margin-top: 10px;\">\n");
      out.write("\t\t\t\t\t\t<label class=\"quc-label\" for=\"quc_passwordAgain_9129526\">密码</label><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"quc-input-bg\"><input type=\"password\"\n");
      out.write("\t\t\t\t\t\t\t class=\"quc-input  quc-input-passwordAgain\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"请输入密码\" id=\"login_pwd\"></span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"quc-field\" style=\"margin-top: 20px;\">\n");
      out.write("\t\t\t\t\t\t<input class=\"quc-submit quc-button quc-button-sign-in\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"登录\" type=\"button\" id=\"login_\">\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--[if lte IE 6]><iframe class=\"quc-ie6-iframe\" src=\"about:blank\" border=\"0\" frameborder=\"0\"></iframe><![endif]-->\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\t<!--公共需要的全局变量-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t$(\"#login\").click(function() {\n");
      out.write("\n");
      out.write("\t\t\t\tvar account = $(\"#account\").val().trim();\n");
      out.write("\t\t\t\tvar password = $(\"#password\").val().trim();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(account == \"\" || account==null){\n");
      out.write("\t\t\t\t\t$(\"#error\").text(\"请输入帐号\").show();\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse{\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tif(password==\"\" || password==null){\n");
      out.write("\t\t\t\t\t\t$(\"#error\").text(\"请输入密码\").show();\n");
      out.write("\t\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse{\n");
      out.write("\t\t\t\t\t\t$(\"#error\").hide();\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tvar url = sy.urls.LOGIN_URL;\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tvar params = {\n");
      out.write("\t\t\t\t\t\t\t\t\"account\":account,\n");
      out.write("\t\t\t\t\t\t\t\t\"password\":password\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t};\n");
      out.write("\t\t\t\t\t\tsy.globalAjax(url, params, \"POST\", function(data) {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\tif(data.status==10003 || data.status==\"10003\"){\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#error\").text(\"用户名不存在或密码错误\").show();\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\telse{\n");
      out.write("\t\t\t\t\t\t\t\twindow.location.href = \"/authentication/get/person/\";\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(document).keydown(function(e){\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(e.keyCode==13){\n");
      out.write("\t\t\t\t\t$(\"#login\").trigger(\"click\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#register\").click(function(){\n");
      out.write("\t\t\t\twindow.location.href= sy.urls.GET_REGISTER_PAGE;\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#otherLogin\").click(function(){\n");
      out.write("\t\t\t\t    \n");
      out.write("\t\t\t\t  $(\"#loginDialog\").show();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#closeDialog\").click(function(){\n");
      out.write("\t\t\t\t$(\"#loginDialog\").hide();\n");
      out.write("\t\t\t\tclearData();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#login_\").click(function(){\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar account = $(\"#login_name\").val().trim();\n");
      out.write("\t\t\t\tvar password = $(\"#login_pwd\").val().trim();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(account == \"\" || account==null){\n");
      out.write("\t\t\t\t\t$(\"#error_message\").text(\"请输入帐号\").show();\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse{\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tif(password==\"\" || password==null){\n");
      out.write("\t\t\t\t\t\t$(\"#error_message\").text(\"请输入密码\").show();\n");
      out.write("\t\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse{\n");
      out.write("\t\t\t\t\t\t$(\"#error_message\").hide();\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tvar url = sy.urls.LOGIN_URL;\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tvar params = {\n");
      out.write("\t\t\t\t\t\t\t\t\"account\":account,\n");
      out.write("\t\t\t\t\t\t\t\t\"password\":password\n");
      out.write("\t\t\t\t\t\t};\n");
      out.write("\t\t\t\t\t\tsy.globalAjax(url, params, \"POST\", function(data) {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\tif(data.status==10003 || data.status==\"10003\"){\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#error_message\").text(\"用户名不存在或密码错误\").show();\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\telse{\n");
      out.write("\t\t\t\t\t\t\t\twindow.location.href = \"/authentication/get/person/\"+data;\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction clearData(){\n");
      out.write("\t\t\t\t$(\"#error_message\").text(\"\");\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#oauth_login\").click(function(){\n");
      out.write("\t\t\t\t   \n");
      out.write("\t\t\t\twindow.open(sy.urls.GET_AUTHORIZE_PAGE+\"?redirect_url=http://baidu.com&client_id=mobile_client&grant_type=password\")\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
