package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class authrorize_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<title>授权认真登录</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\tbody,button,input,select,textarea{font:12px/1.125  Arial,Helvetica,sans-serif}body,h1,h2,h3,h4,h5,h6,dl,dt,dd,ul,ol,li,th,td,p,blockquote,pre,form,fieldset,legend,input,button,textarea,hr{margin:0;padding:0}table{border-collapse:collapse;border-spacing:0}li{list-style:none}fieldset,img{border:0}q:before,q:after{content:''}input,textarea{outline-style:none}input[type=\"text\"],input[type=\"password\"],textarea{outline-style:none;-webkit-appearance:none}textarea{resize:none}address,caption,cite,code,dfn,em,i,th,var{font-style:normal;font-weight:normal}legend{color:#000}abbr,acronym{border:0;font-variant:normal}a,u{text-decoration:none}a:hover{text-decoration:underline}.clearfix:after{display:table;clear:both;content:\"\"}.clearfix{zoom:1}.clear{clear:both;height:0;font:0/0 Arial;visibility:hidden}body{color:#646464}body a,.WB_linkA a,.WB_linkA{color:#1582bd}.WB_linkB a,.WB_linkB{color:#7aa5b9}.WB_logo{margin:0;padding:0;width:140px;height:44px;background:url(../../images/library/base/wb_logo.png?id=1367910055834);_background-image:url(../../images/library/base/wb_logo.gif?id=1367910055834);line-height:200px;overflow:hidden}.WB_logo a{display:block}.WB_logo16a{display:inline-block;background:url(../../images/library/base/wb_logo16_a.png?id=1367910055834) no-repeat;_filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(enabled=true,sizingMethod=image,src='http://img.t.sinajs.cn/t4/appstyle/widget/images/library/base/wb_logo16_a.png?id=1367910055834');width:16px;height:14px;font-size:0;line-height:200px;overflow:hidden}.WB_logo_S{margin:0;padding:0;width:113px;height:34px;background:url(../../images/library/base/wb_logo.png?id=1367910055834) 0 -52px;_background-image:url(../../images/library/base/wb_logo.gif?id=1367910055834);line-height:200px;overflow:hidden}.WB_logo_S a{display:block}.WB_xline1{background:url(../../images/library/base/wb_xline_s1.png?id=1367910055834) center 0 no-repeat;_background-image:url(../../images/library/base/wb_xline_s1.gif?id=1367910055834)}.WB_xline2{background:url(../../images/library/base/wb_xline_s2.png?id=1367910055834) center 0 no-repeat}.WB_xlinen{background:-moz-linear-gradient(left, #eb192d 0%, #fdb940 100%);background:-webkit-gradient(linear, left top, right top, color-stop(0%, #eb192d), color-stop(100%, #fdb940));background:-webkit-linear-gradient(left, #eb192d 0%, #fdb940 100%);background:-o-linear-gradient(left, #eb192d 0%, #fdb940 100%);background:-ms-linear-gradient(left, #eb192d 0%, #fdb940 100%);background:linear-gradient(left, #eb192d 0%,#fdb940 100%);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#eb192d', endColorstr='#fdb940',GradientType=1 )}.WB_iptxt{border:1px solid #bebebe;background:#fafafa;-moz-border-radius:2px;-webkit-border-radius:2px;border-radius:2px;-moz-box-shadow:0px 1px 0px #FFF;-webkit-box-shadow:0px 1px 0px #FFF;box-shadow:0px 1px 0px #FFF}.WB_iptxt:focus{border:1px solid #ffb941;-moz-box-shadow:0px 1px 0px #e1e1e1 inset;-webkit-box-shadow:0px 1px 0px #e1e1e1 inset;box-shadow:0px 1px 0px #e1e1e1 inset;background:#FFF}.WB_textarea{font:14px/1.125 Arial,Helvetica,sans-serif;border:1px solid #bebebe;overflow:hidden;overflow-y:auto;background:#fff url(../../images/library/base/bg_sharebox.png?id=1367910055834) 100% 100% no-repeat;_background-image:url(../../images/library/base/bg_sharebox.gif?id=1367910055834);outline-style:none;-webkit-appearance:none;resize:none;-moz-border-radius:1px;-webkit-border-radius:1px;border-radius:1px;-webkit-box-shadow:0px 1px 0px 0px #f0f0f0;-moz-box-shadow:0px 1px 0px 0px #f0f0f0;box-shadow:0px 1px 0px 0px #f0f0f0}.WB_textarea:focus{border:1px solid #ffdca0;-moz-box-shadow:0px 0px 5px rgba(255,185,65,0.5);-webkit-box-shadow:0px 0px 5px rgba(255,185,65,0.5);box-shadow:0px 0px 5px rgba(255,185,65,0.5);-webkit-transition:all 0.3s ease-out 0s;-moz-transition:all 0.3s ease-out 0s;transition:all 0.3s ease-out 0s}.WB_textarea_auto{border:1px solid #bebebe;-moz-border-radius:1px;-webkit-border-radius:1px;border-radius:1px;-webkit-box-shadow:0px 1px 0px 0px #f0f0f0;-moz-box-shadow:0px 1px 0px 0px #f0f0f0;box-shadow:0px 1px 0px 0px #f0f0f0;background:#fff url(../../images/library/base/bg_sharebox.png?id=1367910055834) 100% 100% no-repeat;_background-image:url(../../images/library/base/bg_sharebox.gif?id=1367910055834);padding:10px}.WB_textarea_auto .textarea_inner{width:100%;font:14px/1.125 Arial,Helvetica,sans-serif;border:none;background:none;overflow:hidden;overflow-y:auto;outline-style:none;-webkit-appearance:none;resize:none}.WB_textarea_foucs{border:1px solid #ffdca0;-moz-box-shadow:0px 0px 5px rgba(255,185,65,0.5);-webkit-box-shadow:0px 0px 5px rgba(255,185,65,0.5);box-shadow:0px 0px 5px rgba(255,185,65,0.5);-webkit-transition:all 0.3s ease-out 0s;-moz-transition:all 0.3s ease-out 0s;transition:all 0.3s ease-out 0s}.WB_checkbox{vertical-align:-2px;*width:13px;*height:13px;*vertical-align:1px}.WB_icon,.WB_icon_txt{display:inline-block;vertical-align:middle;_vertical-align:baseline;*zoom:1}a .WB_icon_txt{*cursor:pointer}a:hover .WB_icon_txt{text-decoration:underline}.WB_tipB_ok,.WB_tipB_err,.WB_tipB_warn,.WB_tipB_warn_red,.WB_tipB_ques,.WB_tipS_ok,.WB_tipS_err,.WB_tipS_warn,.WB_tipS_ques,.WB_tipS_num,.WB_tipS_numWarn,.WB_tipS_info{display:inline-block;vertical-align:middle;background:url(../../images/oauthV3/icon_tips.png?id=1367910055834) no-repeat;_background-image:url(../../images/oauthV3/icon_tips.gif?id=1367910055834)}.WB_tipB_ok,.WB_tipB_err,.WB_tipB_warn,.WB_tipB_warn_red,.WB_tipB_ques,.WB_tipS_num,.WB_tipS_numWarn{width:37px;height:42px}.WB_tipS_ok,.WB_tipS_err,.WB_tipS_warn,.WB_tipS_ques,.WB_tipS_info{width:16px;height:16px}.WB_tipB_ok{background-position:0 0}.WB_tipB_err{background-position:-57px 0}.WB_tipB_warn{background-position:-113px 0}.WB_tipB_warn_red{background-position:-341px 0}.WB_tipB_ques{background-position:-170px 0}.WB_tipS_num{background-position:-227px 0}.WB_tipS_numWarn{background-position:-284px 0}.WB_tipS_ok{background-position:-11px -67px}.WB_tipS_err{background-position:-67px -67px}.WB_tipS_warn{background-position:-124px -67px}.WB_tipS_ques{background-position:-181px -67px}.WB_tipS_info{background-position:-238px -67px}.WB_tipS_num,.WB_tipS_numWarn{font:18px/36px Georgia,Constantia;text-align:center;color:#fff}.WB_check_icon,.WB_ctl_prv,.WB_ctl_nxt,.WB_ctl_prv_dis,.WB_ctl_nxt_dis{background:url(../../images/library/base/icon_tools.png?id=1367910055834) no-repeat !important}.WB_check_icon{display:inline-block;height:14px;width:14px}.WB_ctl_prv,.WB_ctl_nxt,.WB_ctl_prv_dis,.WB_ctl_nxt_dis{width:17px;height:17px;line-height:200px;overflow:hidden;display:block;float:left}.WB_ctl_prv{background-position:-74px 0 !important}.WB_ctl_nxt{background-position:-101px 0 !important}.WB_ctl_prv:hover{background-position:-74px -18px !important}.WB_ctl_nxt:hover{background-position:-101px -18px !important}.WB_ctl_prv_dis{background-position:-74px -36px !important;cursor:default}.WB_ctl_nxt_dis{background-position:-101px -36px !important;cursor:default}a.WB_ctl_prv_dis{background-position:-74px -36px !important;cursor:default}a.WB_ctl_nxt_dis{background-position:-101px -36px !important;cursor:default}.WB_loadingB{height:23px;width:23px;display:inline-block;vertical-align:middle;background:url(../../images/library/base/loading2.gif?id=1367910055834)}.WB_loadingS{height:18px;width:18px;display:inline-block;vertical-align:middle;background:url(../../images/library/base/loading1.gif?id=1367910055834)}.WB_loadingMini{height:15px;width:15px;display:inline-block;vertical-align:middle;background:url(../../images/library/base/loading4.gif?id=1367910055834)}.WB_loadingbgS{background-image:url(../../images/library/base/loading1.gif?id=1367910055834);background-repeat:no-repeat;background-position:center center}.WB_state_fail{display:block;background:url(../../images/library/base/state_fail.png?id=1367910055834) no-repeat top center;_background:url(../../images/library/base/state_fail.gif?id=1367910055834) no-repeat top center;height:245px}.WB_vline{margin:0 3px;color:#ccc}.WB_big_cursor{cursor:url(http://img.t.sinajs.cn/t5/style/images/common/big.cur),auto !important}.WB_small_cursor{cursor:url(http://img.t.sinajs.cn/t5/style/images/common/small.cur),auto !important}.WB_checkbox2{margin-right:3px;vertical-align:middle}.WB_ico_face,.WB_ico_pic,.WB_ico_topic{display:inline-block;width:16px;height:16px;background:url(../../images/library/publisher_icons/publisher_icons.png?id=1367910055834) no-repeat;_background-image:url(../../images/library/publisher_icons/publisher_icons_ie6.png?id=1367910055834)}.WB_ico_face{background-position:0 0}.WB_ico_pic{background-position:0 -20px}.WB_ico_topic{background-position:0 -40px}.WB_pages_minibtn{padding:10px 0;text-align:right}.WB_pages_minibtn .reverse,.WB_pages_minibtn .reverse_disabled,.WB_pages_minibtn .next,.WB_pages_minibtn .next_disabled{display:inline-block;width:17px;height:17px;background:url(../../images/library/ui_items_icons/ui_items.png?id=1367910055834) no-repeat !important;_background-image:url(../../images/library/ui_items_icons/ui_items_ie6.png?id=1367910055834) !important;vertical-align:middle}.WB_pages_minibtn .reverse{margin:0 7px 0 0;background-position:-100px -20px !important}.WB_pages_minibtn .reverse:hover{background-position:-120px -20px !important}.WB_pages_minibtn .reverse_disabled{margin:0 7px 0 0;background-position:-140px -20px !important}.WB_pages_minibtn .next{margin:0 0 0 7px;background-position:-100px 0 !important}.WB_pages_minibtn .next:hover{background-position:-120px 0 !important}.WB_pages_minibtn .next_disabled{margin:0 0 0 7px;background-position:-140px 0 !important}.WB_pages_minibtn .pages_item{display:inline-block;height:15px;margin:0 3px;padding:0 4px;text-align:center;line-height:15px;vertical-align:middle}.WB_pages_minibtn .pages_item:hover{text-decoration:none !important}.WB_pages_minibtn .page_info{margin:0 10px}.WB_input{height:28px;padding:0 5px;border:1px solid;border-color:#c2c2c2 #efefef #f2f2f2 #cfcfcf;background:#fff;color:#333;font-size:12px;line-height:28px;vertical-align:middle}.WB_btn_login,.WB_btn_cancel,.WB_btn_oauth,.WB_btn_oauthIng,.WB_btn_loginIng,.WB_btn_linkIng,.WB_btn_back,.WB_btn_allow,.WB_btn_pass,.WB_btn_link{display:block;height:40px;width:86px;overflow:hidden;zoom:1;line-height:200px;background:url(../../images/oauthV3/oauth_btn.png?id=1367910055834) no-repeat}.WB_btn_login:hover{background-position:-87px 0}.WB_btn_login:active{background-position:-174px 0}.WB_btn_cancel{background-position:0 -41px}.WB_btn_cancel:hover{background-position:-87px -41px}.WB_btn_cancel:active{background-position:-174px -41px}.WB_btn_oauth{background-position:0 -82px}.WB_btn_oauth:hover{background-position:-87px -82px}.WB_btn_oauth:active{background-position:-174px -82px}.WB_btn_loginIng,.WB_btn_loginIng:hover{background-position:-348px 0;cursor:default}.WB_btn_linkIng,.WB_btn_linkIng:hover{background-position:-262px -41px;cursor:default}.WB_btn_oauthIng,.WB_btn_oauthIng:hover{background-position:-262px 0;cursor:default}.WB_btn_back{background-position:0 -123px}.WB_btn_back:hover{background-position:-87px -123px}.WB_btn_back:active{background-position:-174px -123px}.WB_btn_allow{background-position:0 -164px}.WB_btn_allow:hover{background-position:-87px -164px}.WB_btn_allow:active{background-position:-174px -164px}.WB_btn_pass{background-position:0 -205px}.WB_btn_pass:hover{background-position:-87px -205px}.WB_btn_pass:active{background-position:-174px -205px}.WB_btn_link{background-position:-262px -82px}.WB_btn_link:hover{background-position:-262px -123px}.WB_btn_link:active{background-position:-262px -164px}.WB_btnA,.WB_btnB,.WB_btnC{font-size:12px}.WB_btnA em,.WB_btnB em,.WB_btnC em{font-style:normal}.WB_btnA,.WB_btnA span,.WB_btnA_loading{display:inline-block;background:url(../../images/library/base/btns_bg.png?id=1367910055834) no-repeat;color:#FFF;text-decoration:none;height:29px;line-height:28px;min-width:35px;cursor:pointer;overflow:hidden}.WB_btnA{text-align:center;padding-left:4px;text-shadow:0 1px 0 rgba(0,0,0,0.2)}.WB_btnA span{background-position:100% -28px;padding:0 10px 0 6px}.WB_btnA:hover,.WB_btnA_loading{background-position:0 -56px;text-decoration:none !important}.WB_btnA:hover span,.WB_btnA_loading span{background-position:100% -84px}.WB_btnA:active{background-position:0 -112px}.WB_btnA:active span{background-position:100% -141px}.WB_btnA em{float:left}.WB_btnB,.WB_btnB span{display:inline-block;background:url(../../images/library/base/btns_bg.png?id=1367910055834) no-repeat;color:#787878;text-decoration:none;height:29px;line-height:28px;min-width:35px;cursor:pointer;overflow:hidden}.WB_btnB{background-position:0 -169px;text-align:center;padding-left:4px;text-shadow:0 1px 0 #FFF}.WB_btnB span{background-position:100% -197px;padding:0 10px 0 6px}.WB_btnB:hover{background-position:0 -225px;text-decoration:none !important}.WB_btnB:hover span{background-position:100% -254px}.WB_btnB:active{background-position:0 -281px}.WB_btnB:active span{background-position:100% -310px}.WB_btnC{padding:2px;display:inline-block}.WB_btnC span{display:inline-block;padding:0 7px;height:23px;line-height:22px;border:1px solid #d8d8d8;-webkit-border-radius:3px;-moz-border-radius:3px;border-radius:3px;background:#f8f8f8;overflow:hidden}.WB_btnC em{float:left}.WB_btnA .WB_btnicn_add,.WB_btnC .WB_btnicn_ok,.WB_btnC .WB_btnicn_each{display:inline-block;width:8px;height:8px;overflow:hidden;background:url(../../images/library/base/icon_follow.png?id=1367910055834) no-repeat;margin:10px 3px 0 0}.WB_btnA_loading .WB_btnicn_add{display:inline-block;width:18px;height:18px;background:url(../../images/library/base/loading3.gif?id=1367910055834);margin:5px 3px 0 0}.WB_btnC .WB_btnicn_ok{width:11px;height:8px;background-position:-18px 0;margin-top:8px}.WB_btnC .WB_btnL{color:#d3d3d3;margin:3px 8px 0 10px;font-size:0;line-height:0;width:1px;overflow:hidden;height:16px;border-left:1px solid #d3d3d3;overflow:hidden}.WB_btnC .WB_btnicn_each{width:11px;height:12px;background-position:-39px 0;margin-top:6px}.WB_btnC .WB_btnicn_loading{display:inline-block;width:18px;height:18px;background:url(../../images/library/base/loading1.gif?id=1367910055834);margin:3px 3px 0 0}.WB_widgets .WB_btnB{background:url(../../images/library/base/btns_bg.png?id=1367910055834) no-repeat !important}.WB_widgets .WB_btnB{background-position:0 -169px !important}.WB_widgets .WB_btnB:hover{background-position:0 -225px !important}.WB_widgets .WB_btnB:active{background-position:0 -281px !important}.WB_widgets .WB_btnD,.WB_widgets .WB_btnD span{display:inline-block;height:32px}.WB_widgets .WB_btnD{padding-left:4px;background:url(../../images/library/base/btns_bg.png?id=1367910055834) left -360px no-repeat !important;line-height:32px}.WB_widgets .WB_btnD span{padding:0 16px 0 12px;background:url(../../images/library/base/btns_bg.png?id=1367910055834) right -400px no-repeat;color:#fff}.WB_widgets .WB_btnD:hover{background-position:left -440px !important;text-decoration:none !important}.WB_widgets .WB_btnD:hover span{background-position:right -480px}.WB_widgets .WB_btnD:active{background-position:left -520px !important}.WB_widgets .WB_btnD:active span{background-position:right -560px}.WB_UIbody{background:#d6dbdd url(../../images/library/frame/bg_wb_uibody.png?id=1367910055834) repeat-x 0 0}.WB_UIplus{background:url(../../images/library/frame/bg_wb_uiplus.png?id=1367910055834);_background-image:url(../../images/library/frame/bg_wb_uiplus.gif?id=1367910055834);height:285px;position:fixed;_position:absolute;bottom:0;width:100%;z-index:-1}.WB_dialog{position:absolute;padding:10px;-moz-border-radius:8px;-webkit-border-radius:8px;-o-border-radius:8px;border-radius:8px;background:rgba(0,0,0,0.2);background:url(../../images/library/dialog/dlg_bg.png?id=1367910055834) repeat\\9}.WB_dialog .WB_panel{_float:left;border:0 none}.WB_dialog .WB_dl_close{position:absolute;width:17px;height:17px;background:url(../../images/library/dialog/close_icon.png?id=1367910055834) 0 -15px !important;_background-image:url(../../images/library/dialog/close_icon.gif?id=1367910055834) !important;overflow:hidden;line-height:100px;top:15px;right:15px;z-index:80}.WB_dialog .WB_dl_close:hover{background-position:0 -33px !important}.WB_panel{-moz-border-radius:6px;-webkit-border-radius:6px;border-radius:6px;-moz-box-shadow:0px 0px 5px #c6c6c6;-webkit-box-shadow:0px 0px 5px #c6c6c6;box-shadow:0px 0px 5px #c6c6c6;background:url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIwJSIgeTI9IjEwMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iI2ZmZmZmZiIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjgwJSIgc3RvcC1jb2xvcj0iI2ZiZmJmYiIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjEwMCUiIHN0b3AtY29sb3I9IiNmNWY1ZjUiIHN0b3Atb3BhY2l0eT0iMSIvPgogIDwvbGluZWFyR3JhZGllbnQ+CiAgPHJlY3QgeD0iMCIgeT0iMCIgd2lkdGg9IjEiIGhlaWdodD0iMSIgZmlsbD0idXJsKCNncmFkLXVjZ2ctZ2VuZXJhdGVkKSIgLz4KPC9zdmc+);background:#fff url(../../images/library/base/bg_for_ie.png?id=1367910055834) repeat-x 0 bottom;background:-moz-linear-gradient(top, #fff 0%, #fbfbfb 80%, #f5f5f5 100%);background:-webkit-gradient(linear, left top, left bottom, color-stop(0%, #fff), color-stop(80%, #fbfbfb), color-stop(100%, #f5f5f5));background:-webkit-linear-gradient(top, #fff 0%, #fbfbfb 80%, #f5f5f5 100%);background:-o-linear-gradient(top, #fff 0%, #fbfbfb 80%, #f5f5f5 100%);background:-ms-linear-gradient(top, #fff 0%, #fbfbfb 80%, #f5f5f5 100%);background:linear-gradient(top, #ffffff 0%,#fbfbfb 80%,#f5f5f5 100%);border:1px solid #d2d2d2;_zoom:1}.WB_tips_yls{font:12px/1.125  Arial,Helvetica,sans-serif;color:#646464;position:absolute;border:1px solid #d2d2d2;padding:8px 24px 8px 8px;-moz-box-shadow:1px 1px 0px #fff inset,2px 4px 0px rgba(0,0,0,0.2);-webkit-box-shadow:1px 1px 0px #fff inset,2px 4px 0px rgba(0,0,0,0.2);box-shadow:1px 1px 0px #fff inset,2px 4px 0px rgba(0,0,0,0.2);background:#fffcc6}.WB_tips_yls a{color:#0078b6}.WB_tips_yls .arr{position:absolute;height:12px;width:22px;overflow:hidden;bottom:-12px;left:12px;background:url(../../images/library/tips/bg_tips.png?id=1367910055834) 0 -20px no-repeat}.WB_tips_yls .arr:before{content:\"\";bottom:-7px;left:0;width:0;height:0;display:block;border:7px solid transparent;border-top-color:rgba(0,0,0,0.2);position:absolute}.WB_tips_yls .arr:after{content:\"\";width:14px;height:14px;display:block;border:1px solid d2d2d2;background:#fffcc6;-moz-transform:rotate(45deg);-webkit-transform:rotate(45deg);transform:rotate(45deg);position:absolute;bottom:7px;display:none}.WB_tips_yls .WB_tipS_err{vertical-align:middle}.WB_tips_yls .WB_sp_txt{color:#ff0000;vertical-align:middle;margin-left:3px}.WB_tips_yls .WB_normal_txt{color:#666;vertical-align:middle;margin-left:3px}.WB_tips_yls .close,.WB_tips_mini .close{position:absolute;height:7px;width:8px;background:url(../../images/library/tips/close_icon.png?id=1367910055834) 0 -20px;right:10px;top:10px;font-size:0;overflow:hidden}.WB_tips_yls .close:hover,.WB_tips_mini .close:hover{background-position:0 -28px}.WB_tips_mini{font:12px/1.125  Arial,Helvetica,sans-serif;color:#646464;position:absolute;height:20px;line-height:20px;padding:0 10px;border:1px solid #f9f2a7;background:#feffe5;-moz-border-radius:2px;-webkit-border-radius:2px;border-radius:2px;color:#666}.WB_tips_mini a{color:#0078b6}.WB_tips_mini .tm_arr{position:absolute;left:10px;bottom:-5px;width:8px;height:5px;overflow:hidden;background:url(../../images/library/tips/bg_tips.png?id=1367910055834) 0 0}.WB_tips_mini .close{top:7px}.WB_tips_mini .WB_icon_txt{margin-left:5px}.WB_tm_ctrl{padding-right:25px}.WB_t_err{color:#e24714}.WB_tips_wait{font:12px/1.125  Arial,Helvetica,sans-serif;color:#646464;padding:17px 19px;-moz-border-radius:3px;-webkit-border-radius:3px;border-radius:3px;position:absolute;font-size:14px;font-weight:700;color:#FFF;background:url(../../images/library/tips/tip_bg.png?id=1367910055834);background:none rgba(65,65,65,0.8);_background:#444}.WB_tips_wait a{color:#0078b6}.WB_tips_wait .WB_icon_txt{padding-left:5px;_padding-bottom:2px}.WB_tips_show{font:12px/1.125  Arial,Helvetica,sans-serif;color:#646464;position:absolute;background:#fff;border:1px solid #d2d2d2;padding-top:1px;-moz-box-shadow:1px 1px 0px #fff inset,2px 4px 0px rgba(0,0,0,0.2);-webkit-box-shadow:1px 1px 0px #fff inset,2px 4px 0px rgba(0,0,0,0.2);box-shadow:1px 1px 0px #fff inset,2px 4px 0px rgba(0,0,0,0.2)}.WB_tips_show a{color:#0078b6}.WB_tips_show .ts_arr{position:absolute;left:12px;top:-5px;width:8px;height:5px;overflow:hidden;background:url(../../images/library/tips/bg_tips.png?id=1367910055834) 0 -8px}.WB_tips_show .Wb_tipsshow_wrap{background:#fafafa}.WB_tips_show .WB_tips_show_close{position:absolute;background:url(../../images/library/tips/close_icon.png?id=1367910055834) 0 0 !important;height:7px;width:7px;overflow:hidden;line-height:100px;top:5px;right:5px}.WB_tips_show .WB_tips_show_close:hover{background-position:0 -9px !important}.WB_tips_smart{font:12px/1.125  Arial,Helvetica,sans-serif;border:1px solid #b6c0cc;min-width:124px;position:absolute;background:#FFF;margin:1px}.WB_tips_smart p,.WB_tips_smart ul,.WB_tips_smart li{padding:0;margin:0;list-style:none;font-size:12px}.WB_tips_smart .tipsmt_list li{display:inline}.WB_tips_smart .tipsmt_title,.WB_tips_smart .tipsmt_list li a{padding:5px 10px;display:block;white-space:nowrap;overflow:hidden;text-decoration:none}.WB_tips_smart .tipsmt_list li a{color:#666}.WB_tips_smart .tipsmt_list li a:hover{text-decoration:none;background:#eeeeef}.WB_tips_smart .tipsmt_list li a b{font-weight:700;color:#4f8ff4}.WB_tips_smart .tipsmt_cur a{background:#eeeeef}.WB_tips_top{font:12px/1.125  Arial,Helvetica,sans-serif;position:absolute;-moz-border-radius:2px;-webkit-border-radius:2px;border-radius:2px;background:url(../../images/library/tips/bg_trans.png?id=1367910055834);padding:2px}.WB_tips_top a{color:#0078b6}.WB_tips_top .tips_inner{color:#000 !important;border:1px solid #ccc;background:#feffe5;-webkit-box-shadow:inset 0px 0px 0px 1px #fffff3;-moz-box-shadow:inset 0px 0px 0px 1px #fffff3;box-shadow:inset 0px 0px 0px 1px #fffff3}.WB_tips_top .WB_icon_txt{margin-left:3px}.WB_tips_top .tips_inner{padding:6px 10px}.WB_tips_top .tips_arr{position:absolute;right:70px;top:-5px;width:11px;height:8px;overflow:hidden;font-size:0;background:url(../../images/library/tips/bg_tips_top.png?id=1367910055834)}.WB_tips_top .tips_arr_btm{position:absolute;left:70px;bottom:-3px;width:11px;height:8px;overflow:hidden;font-size:0;background:url(../../images/library/tips/bg_tips_btm.png?id=1367910055834)}.WB_tips_sp{position:absolute;background:#fff9cb;border:1px solid #ffdd93;padding:7px}.WB_tips_black{position:absolute;background:#333;padding:0 5px;border-radius:2px;color:#e3e3e3;line-height:22px;font-size:12px;height:22px}.WB_tips_black .tm_arr{display:block;border-style:solid dashed dashed dashed;border-color:#333 transparent transparent transparent;border-width:3px 3px 0 3px;font-size:0;line-height:0;vertical-align:middle;width:0;height:0;position:relative;bottom:0;left:2px}.WB_tips_mini_w{position:absolute;border:1px solid #e7e7e7;padding:7px;background:#fff}.WB_tips_mini_w .arr_t{background:url(../../images/library/tips/bg_tips.png?id=1367910055834) 0 -30px;width:11px;height:6px;overflow:hidden;font-size:0;position:absolute;top:-6px;left:149px}.WB_tip_sg{position:absolute;padding:6px;border-radius:8px;background:url(../../images/library/base/layer_bg.png?id=1367910055834)}.WB_tip_sg .WB_tip_sg_inner{padding:15px 20px;background:#fff;border-radius:5px}.WB_tip_sg .WB_icon_txt{margin-left:5px;font-size:14px}.WB_tips_top .WB_tips_close{position:absolute;width:12px;height:12px;background:url(../../images/library/ui_items_icons/ui_items.png?id=1367910055834) 0 -40px no-repeat !important;_background-image:url(../../images/library/ui_items_icons/ui_items_ie6.png?id=1367910055834) !important;right:6px;top:10px}.WB_tips_top .WB_tips_close:hover{background-position:-20px -40px !important}.WB_selector{font-size:12px;display:inline-block;position:relative;zoom:1;width:60px;border:1px solid #ccc;padding:5px 27px 5px 10px;border-radius:3px;cursor:default;background:#fff}.WB_selector .slt_ctrl{position:absolute;right:0;top:5px;bottom:5px;border-left:1px solid #ccc;width:16px}.WB_selector .slt_ctrl .slt_arr{display:inline-block;width:0;height:0;border-width:4px;border-style:solid dashed dashed dashed;border-color:#7f7f7f transparent transparent transparent;overflow:hidden;position:relative;margin:5px 0 0 4px}.WB_selector .slt_opt{position:absolute;left:0;top:26px}.WB_selector .slt_opt .slt_opt_inner{display:block;background:#fff;width:96px;border:1px solid #ccc;border-radius:3px}.WB_selector .slt_opt .slt_opt_inner em{display:block;margin:1px;height:20px;line-height:20px;padding-left:8px}.WB_selector .slt_opt .slt_opt_inner em:hover{background:#e6e6e6}body{color:#333;font-size:14px}a{color:#1885bc}a.WB_text2,.WB_text2{color:#87bedc}.vline{color:#969696;margin:0 5px}.oauth_xline{padding-top:14px}.oauth_wrap{width:580px;margin:0 auto}.oauth_header{margin-bottom:11px}.oauth_header .WB_logo{float:left}.oauth_header .login_account{margin-top:20px;float:right;font-size:12px;color:#969696}.oauth_header .login_account a{color:#969696}.oauth_header .login_account .sign_up_link,.oauth_header .login_account .special_login_link{color:#1885bc;font-size:14px;font-weight:bold}.oauth_header .login_account .vline_login{margin:0 8px;font-size:14px}.oauth_content{padding:10px 18px 0 20px}.oauth_main_info{margin-bottom:27px;padding-top:5px}.oauth_main_info .app_name{font-weight:700}.oauth_login{margin-top:20px;padding-bottom:20px;position:relative;_zoom:1;border-bottom:1px dotted #d8d8d8}.oauth_login_box01{margin-top:5px;padding-bottom:30px}.oauth_login_submit{float:right;margin-left:10px;text-align:right}.oauth_input_label,.oauth_form_input{display:inline-block;vertical-align:middle}.oauth_login .oauth_form_input{width:238px;height:28px;padding:0 9px;line-height:28px;font-size:14px;color:#9a9a9a}.oauth_input_label{width:140px;text-align:right;line-height:30px;_vertical-align:6px}.oauth_login_01{margin-bottom:10px}.oauth_login_01 .WB_text2{font-size:12px}.oauth_login_submit{font-size:12px;line-height:28px}.oauth_form_checkbox{margin-right:6px;vertical-align:-3px}.oauth_submit{margin-left:2px}.oauth_submit a{margin-left:5px}.formbtn_01{margin-right:11px}.oauth_formbtn{margin:7px 0 0 0;height:auto}.oauth_formbtn a{float:left;cursor:pointer}.oauth_tiptxt{margin:10px 0 0 20px;font-size:12px;color:#646464;line-height:18px}.oauth_login .oauth_btnA{position:absolute;bottom:20px;width:185px;margin-left:-185px}.oauth_login .oauth_code{margin-top:10px}.oauth_login .oauth_code *{vertical-align:middle}.oauth_login .oauth_code .code_img{vertical-align:top}.WB_tm_ctrl{width:222px}.WB_wdicon{display:inline-block;width:15px;height:16px;background:url(../../images/oauthV3/icons.png?id=1367910055834);vertical-align:middle}.login_info .icon_help{display:inline-block;width:14px;height:14px;background:url(../../images/oauthV3/icons.png?id=1367910055834) 0 -20px;vertical-align:-2px;margin-left:5px}.login_info{float:left;margin-top:24px;font-size:12px;color:#999;position:relative;width:340px}.login_info .WB_tips_mini_w{left:0;top:20px}.oauth_main_content{padding-bottom:15px;border-bottom:dotted 1px #d8d8d8}.oauth_main_content .app_info{background:#fafafa;border:1px solid #ececec;padding:10px;margin-top:10px}.oauth_main_content .app_info_main{width:300px;float:left}.oauth_main_content .app_info_main .app_icon{overflow:hidden;width:64px;height:64px;border-radius:3px;float:left}.oauth_main_content .app_info_main .app_icon img{display:block;width:64px;height:64px}.oauth_main_content .app_info_main .app_intro{margin-left:74px}.oauth_main_content .app_info_main .app_intro h3{margin-bottom:5px}.oauth_main_content .app_info_main .app_intro h3 a{font-size:14px}.oauth_main_content .app_info_main .app_des{font-size:12px;line-height:20px;color:#999}.oauth_main_content .app_info_plus{float:right}.oauth_main_content .app_info_plus .plus_tit{font-size:12px;padding-bottom:10px}.oauth_main_content .app_info_plus .app_user_list li{float:left;margin-right:3px;_display:inline;height:30px;width:30px}.oauth_main_content .app_info_plus .app_user_list li img{display:block;width:30px;height:30px}.oauth_main_content .app_info_plus .app_user_list li .more{display:block;width:30px;height:30px;background:#eaebec;text-align:center;text-decoration:none;font-size:18px;color:#999;font-family:Tahoma;font-weight:700}.oauth_main_content .app_info_plus .app_user_list li .more:hover{color:#FFB941}.oauth_main_content .oauth_info{position:relative;padding-top:18px}.oauth_main_content .oauth_list .do_list{font-size:12px;margin:15px 0 0 20px}.oauth_main_content .oauth_list .do_list li{margin-bottom:12px}.oauth_main_content .oauth_list .do_list i{display:inline-block;vertical-align:middle;background:url(../../images/oauthV3/icons.png?id=1367910055834);width:15px;height:13px;margin-right:5px}.oauth_main_content .oauth_list .do_list .icon_user{background-position:-20px 0}.oauth_main_content .oauth_list .do_list .icon_rss{background-position:-40px 0}.oauth_main_content .oauth_list .do_list .icon_comm{background-position:-60px 0}.oauth_main_content .oauth_info .oauth_info_plus{position:absolute;font-size:12px;padding:26px 0 0 0;width:190px;left:350px;top:12px}.oauth_main_content .oauth_info .sele_des{color:#999;line-height:20px;margin-top:5px}.oauth_main_content .no_plus .oauth_list{margin-left:84px}.oauth_stat{padding-top:20px;text-align:center}.oauth_stat .stat_icon{padding-bottom:15px}.oauth_stat .stat_tips{padding-bottom:10px}.oauth_stat .err_txt{font-size:12px;color:#999;padding-bottom:10px}.oauth_stat .stat_link{font-size:12px;color:#999;padding-bottom:10px}.oauth_stat .stat_link i{margin:0 3px}.allow_list{font-size:12px}.allow_list .list_tit{margin-bottom:10px}.allow_list .allow_con{background:#fafafa;border:1px solid #ebebeb;border-radius:3px;padding:0 20px}.allow_list .allow_con .row_list{overflow:hidden}.allow_list .allow_con .row{border-top:1px dotted #c9c9c9;padding:9px 0;margin-top:-1px}.allow_list .allow_con .WB_checkbox{margin-right:5px;vertical-align:middle}.oauth_login .code_img{display:inline-block;width:75px;height:30px}.oauth_login .code_img img{width:75px;height:30px}.WB_oauth_tips{position:absolute;width:225px;top:-46px;left:143px}.app_info_main .app_intro_name{color:#1582bd;font-weight:bold}.oauth_info .oauth_target_name,.oauth_info .sele_des_em{color:#1582bd}.oauth_password{position:relative}.oauth_login_01 .input_note{position:absolute;color:#9a9a9a;left:155px;top:6px}.event_area{float:left;padding:12px 0 0 0}.event_area .event_mark{width:280px;height:30px;background:url(../../images/oauthV3/new_year_event.png?id=1367910055834)}.oauth_login_qrcode .qrcode_wrapper{position:relative;width:200px;margin:0 auto;padding:0 0 20px 0;text-align:center}.qrcode_first_note{position:relative;padding-bottom:1px;font-size:12px}.qrcode_first_note .client_download_link{color:#333}.qrcode_first_note .client_download_link:hover{color:#1582bd}.qrcode_first_note .WB_tipS_ques{height:18px;margin-left:3px;vertical-align:middle}.qrcode_first_note .W_layer{display:none}.note_layer_show .W_layer{display:block}.qrcode_first_note .W_layer .arrow_t{margin-left:-14px;left:50%}.qrcode_first_note .W_tips .icon{float:left;margin-right:3px;vertical-align:middle}.qrcode_first_note .W_tips .txt{margin-left:19px;text-align:left}.qrcode_first_note .W_layer .qrcode_map{margin-top:6px}.qrcode_first_note .W_layer{left:66px;top:23px}.qrcode_img_container .qrcode_img{width:180px;height:180px}.tips_qrcode_scan_success{left:-30px;top:-16px}.W_layer{position:absolute;border-radius:3px;z-index:9999}.W_layer .bg{padding:3px;border-radius:4px;background:url(../../images/oauthV3/layer_bg.png?id=1367910055834) repeat}.W_layer .content{position:relative;background:#fff;border:1px solid #ccc;border-radius:2px}.W_layer .arrow{position:absolute;overflow:hidden;display:block;background:url(../../images/oauthV3/layer_arrow.png?id=1370232467958) no-repeat}.W_layer .arrow_r,.W_layer .arrow_l{width:9px;height:14px;top:20px;right:-5px;background-position:-8px -24px}.W_layer .arrow_l{right:auto;left:-5px;background-position:0 -24px}.W_layer .arrow_t,.W_layer .arrow_b{width:14px;height:9px;top:-5px;left:30px;background-position:0 0}.W_layer .arrow_b{top:auto;bottom:-5px;background-position:0 -8px}.W_layer .layer_qrcode{padding:13px 7px 15px 20px}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-1.8.3.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/basic/sy.js\"></script>\n");
      out.write("\n");
      out.write("<body class=\"WB_UIbody WB_widgets\">\n");
      out.write("<div class=\"WB_xline1 oauth_xline\" id=\"outer\">\n");
      out.write(" <div class=\"oauth_wrap\">\n");
      out.write("    <div class=\"oauth_header clearfix\">\n");
      out.write("      <h1 class=\"WB_logo\" title=\"\"><a href=\"javascript:void(0);\">授权登录</a></h1>\n");
      out.write("\t\n");
      out.write("    </div>\n");
      out.write("    <!-- å¸¦å¤´å  -->\n");
      out.write("    <div class=\"WB_panel oauth_main\">\n");
      out.write("    <form name=\"authZForm\"  method=\"post\" node-type=\"form\" style=\"height:400px;\">\n");
      out.write("      <div class=\"oauth_content\" node-type=\"commonlogin\">\n");
      out.write("         <p class=\"oauth_main_info\">\n");
      out.write("\t\t\t授权  <a href=\"javascript:void(0);\" target=\"_blank\" class=\"app_name\">用户平台</a> 访问你的授权帐号\n");
      out.write("\t\t </p>\n");
      out.write("        \t\n");
      out.write("        <!-- ç»å½ -->\n");
      out.write("        \t<div class=\"oauth_login clearfix\">\n");
      out.write("\t          <!-- <form name=\"authZForm\" action=\"authorize\" method=\"post\" node-type=\"form\"> -->\n");
      out.write("\t\t\t\t  \n");
      out.write("\t       \t       \n");
      out.write("\t\t\t\t\t<div class=\"oauth_login_form\">\n");
      out.write("\t\t\t            <p class=\"oauth_login_01\">\n");
      out.write("\t\t\t              <label class=\"oauth_input_label\">帐号：</label>\n");
      out.write("\t\t\t              <input type=\"text\" class=\"WB_iptxt oauth_form_input\" id=\"userId\" name=\"userId\" value=\"\" node-type=\"userid\" autocomplete=\"off\" tabindex=\"1\" style=\"color: rgb(154, 154, 154);\">\n");
      out.write("\t\t\t            </p>\n");
      out.write("\t\t\t            <p>\n");
      out.write("\t\t\t              <label class=\"oauth_input_label\">密码：</label>\n");
      out.write("\t\t\t              <input type=\"password\" class=\"WB_iptxt oauth_form_input\" id=\"passwd\" name=\"passwd\" node-type=\"passwd\" autocomplete=\"off\" tabindex=\"2\">\n");
      out.write("\t\t\t            </p>\n");
      out.write("\t\t\t\t\t\t<p class=\"oauth_code\" node-type=\"validateBox\" style=\"display:none\">\n");
      out.write("\t\t\t\t\t\t  <label class=\"oauth_input_label\">验证码：</label>\n");
      out.write("\t\t\t\t\t\t  <input type=\"text\" tabindex=\"3\" node-type=\"vcode\" class=\"WB_iptxt oauth_form_input oauth_form_code\"><span class=\"code_img\"><img node-type=\"pincode\" width=\"75\" height=\"30\"></span><a class=\"WB_text2\" node-type=\"changeCode\" href=\"https://api.weibo.com/oauth2/authorize?client_id=3977697501&redirect_uri=http%3A%2F%2Fi.360.cn%2Foauth%2Fcallback%3Fc%3DSina%26f%3Dpcw_i360%26destUrl%3Dhttp%253A%252F%252Fi.360.cn%252F&response_type=code&state=7f1176b742362d5aad9cfa51a13848f8&forcelogin=true#\">换一换</a>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"oauth_code\" node-type=\"vdunBox\" style=\"display:none\">\n");
      out.write("\t\t\t\t\t\t  <label class=\"oauth_input_label\">微盾动态码：</label>\n");
      out.write("\t\t\t\t\t\t  <input type=\"text\" tabindex=\"3\" class=\"WB_iptxt oauth_form_input oauth_form_wd\" node-type=\"vdun\" maxlength=\"6\">\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- </form> -->\n");
      out.write("\t\t\t\t<div class=\"tips WB_tips_yls WB_oauth_tips\" node-type=\"tipBox\" style=\"display:none\" id=\"tipBox\">\n");
      out.write("\t\t\t\t\t<span class=\"WB_tipS_err\"></span><span class=\"WB_sp_txt\" node-type=\"tipContent\" id=\"tipContent\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"arr\" node-type=\"tipArrow\"></span>\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0);\" class=\"close\" node-type=\"tipClose\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("       <div class=\"oauth_login_box01 clearfix\">\n");
      out.write("          <div class=\"oauth_login_submit\">\n");
      out.write("              <p class=\"oauth_formbtn\"><a node-type=\"submit\" tabindex=\"4\" action-type=\"submit\" href=\"javascript:void(0);\" id=\"login\" class=\"formbtn_01\">登录</a>\n");
      out.write("              <a node-type=\"cancel\" tabindex=\"5\" href=\"javascript:void(0);\" action-type=\"cancel\" class=\"\" id=\"close\">取消</a></p>\n");
      out.write("          </div>\n");
      out.write("         </div>\n");
      out.write("        <!-- /登录 --> \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- <div id=\"access_div\" style=\"margin-left:20px;\">\n");
      out.write("            <label style=\"height:20px;\">\n");
      out.write("               AccessToken:<input type=\"text\" id=\"access_token\" style=\"height:20px;\">\n");
      out.write("            </label>\n");
      out.write("            \n");
      out.write("            <label>\n");
      out.write("                                  重定向URL:<input type=\"text\" id=\"access_token\">\n");
      out.write("            </label>\n");
      out.write("        \n");
      out.write("        </div> -->\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    <!-- /带头像 -->\n");
      out.write("    <!-- 根据域名修改文案 -->\n");
      out.write("        <!-- <p class=\"oauth_tiptxt\">提示：为保障帐号安全，请认准本页URL地址必须以 api.weibo.com 开头</p> -->\n");
      out.write("    \t</div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("         $(\"#login\").click(function(){\n");
      out.write("        \t \n");
      out.write("        \t    var userName = $(\"#userId\").val();\n");
      out.write("        \t    var password = $(\"#passwd\").val();\n");
      out.write("        \t    \n");
      out.write("        \t    if(userName==\"\"){\n");
      out.write("        \t    \t\n");
      out.write("        \t    \t$(\"#tipContent\").text(\"请输入账户名\");\n");
      out.write("        \t    \t$(\"#tipBox\").show();\n");
      out.write("        \t    }\n");
      out.write("        \t    else{\n");
      out.write("        \t    \t\n");
      out.write("        \t    \tif(password==\"\"){\n");
      out.write("        \t    \t\t$(\"#tipContent\").text(\"请输入密码\");\n");
      out.write("            \t    \t$(\"#tipBox\").show();\n");
      out.write("        \t    \t}\n");
      out.write("        \t    \telse{\n");
      out.write("        \t    \t\t$(\"#tipBox\").hide();\n");
      out.write("        \t    \t\tvar url = \"/authentication/oauth/token\";\n");
      out.write("        \t    \t\t\n");
      out.write("        \t    \t\tvar params = {\n");
      out.write("        \t    \t\t\t\t\"client_id\":\"mobile-client\",\n");
      out.write("        \t    \t\t\t\t\"client_secret\":\"mobile\",\n");
      out.write("        \t    \t\t\t\t\"grant_type\":\"password\",\n");
      out.write("        \t    \t\t\t\t\"scope\":\"read,write\",\n");
      out.write("        \t    \t\t\t\t\"username\":userName,\n");
      out.write("        \t    \t\t\t\t\"password\":password\n");
      out.write("        \t    \t\t};\n");
      out.write("        \t    \t\t\n");
      out.write("        \t    \t\t\n");
      out.write("        \t    \t\tsy.globalAjax(url, params, \"GET\", function(data){\n");
      out.write("        \t    \t\t\t\n");
      out.write("        \t    \t\t\tif(data.accessToken){\n");
      out.write("        \t    \t\t\t\twindow.location=\"http://www.baidu.com?access_token=\"+data.accessToken+\"&scope=\"+data.scope+\"&expires_in=\"+data.expire_date;\n");
      out.write("        \t    \t\t\t}\n");
      out.write("        \t    \t\t\telse{\n");
      out.write("        \t    \t\t\t\t$(\"#tipContent\").text(data.message);\n");
      out.write("                    \t    \t$(\"#tipBox\").show();\n");
      out.write("        \t    \t\t\t}\n");
      out.write("        \t    \t\t\t\n");
      out.write("        \t    \t\t});\n");
      out.write("        \t    \t\t\n");
      out.write("        \t    \t}\n");
      out.write("        \t    \t\n");
      out.write("        \t    }\n");
      out.write("        \t \n");
      out.write("         }); \n");
      out.write("\n");
      out.write("         \n");
      out.write("         $(\"#close\").click(function(){\n");
      out.write("                  window.close();\t \n");
      out.write("         });\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
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
