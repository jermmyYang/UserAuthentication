/**
 * 模版类
 * @author jermmy
 */
(function(sy){
	
	  sy.template = {
			  /**
			   * 获取用户名模版
			   * @author jermmy
			   */
			  getUserNameTemplate:function(){
				  
				  var userNameTemplate = '<div id="bd">';
				  userNameTemplate +='<div class="grid-3 clearfix">';
				  userNameTemplate +='<div class="article mod-4">';
				  userNameTemplate +='<div class="art-mod">';
				  userNameTemplate +='<div class="art-hd clearfix"><h2>设置用户名</h2></div>';
				  userNameTemplate +='<div class="art-bd">';
				  userNameTemplate +='<p class="mod-info">请输入您的用户名</span></p>';
				  userNameTemplate +='<div class="set-nickname quc-wrapper quc-page">';
				  userNameTemplate +='<div class="quc-mod-set-nickname">';
				  userNameTemplate +='<form class="quc-form">';
				  userNameTemplate +='<p class="quc-input-wrapper quc-input-long">';
				  userNameTemplate +='<span class="quc-input-bg"><input type="text" id="nickname" class="quc-input quc-input-nickname" minlength="2" maxlength="14" autocomplete="off" placeholder="请输入昵称：2-14个字符,支持中英文"></span>';
				  userNameTemplate +='<input type="button" id="saveBtn" value="保存" class="quc-submit quc-button quc-button-save">';
				  userNameTemplate +='<div class="quc-alternative-wrapper" id="quc_wrapper"><p class="quc-tip-error" id="quc_error"></p><div class="quc-alternatives"></div></div>';
				  userNameTemplate +='</form>';
				  userNameTemplate +='</div>';
				  userNameTemplate +='</div>';
				  userNameTemplate +='</div>';
				  userNameTemplate +='</div>';
				  userNameTemplate +='</div>';
				  userNameTemplate +='</div>';
                  
				  return userNameTemplate;
			  },
			  /**
			   * 获取用户信息模版
			   * @author jermmy
			   */
			  getUserInfoTemplate:function(){
				  
				  var userInfoTemplate = '<div class="mod-3">';
				  userInfoTemplate +='<div class="art-mod">';
				  userInfoTemplate +='<div class="art-hd clearfix"><h2>基本资料</h2></div>';
				  userInfoTemplate +='<div class="art-bd">';
				  userInfoTemplate +='<div class="form form-1 mod-reslut-t2">';
				  userInfoTemplate +='<form>';
				  userInfoTemplate +='<ul>';
				  userInfoTemplate +='<li class="fm-item">';
				  userInfoTemplate +='<label for="#" class="k">性 别：</label>';
				  userInfoTemplate +='<span class="v" id="sex_select">';
				  userInfoTemplate +='<label class="item"><input type="radio" value="1" name="sex" class="radio"> <span>男</span></label>';
				  userInfoTemplate +='<label class="item"><input type="radio" value="2" name="sex" class="radio"> <span>女</span></label>';
				  userInfoTemplate +='</span>';
				  userInfoTemplate +='</li>';
				  userInfoTemplate +='<li class="fm-item">';
				  userInfoTemplate +='<label for="#" class="k">生 日：</label>';
				  userInfoTemplate +='<span class="v">';
				  userInfoTemplate +='<input type="text" id="date" style="line-height:1.8;">';
				  userInfoTemplate +='</span>';
				  userInfoTemplate +='<div class="btns">';
				  userInfoTemplate +='<span class="btn btn-2 modify-basic-info-btn" id="saveInfo" style="margin-top:20px;">保存修改</span>';
				  userInfoTemplate +='</div>';
				  userInfoTemplate +='</form>';
				  userInfoTemplate +='</div>';
				  userInfoTemplate +='</div>';
				  userInfoTemplate +='</div>';
				  
				  return userInfoTemplate;
			  },
			  /**
			   * 账户信息获取左侧菜单
			   * @author jermmy
			   */
			  getLeftInfoMenu:function(){
				  
				  var leftMenuHtml = '<div class="aside-menu">';
				  leftMenuHtml +='<ul id="info_li_list">';
				  leftMenuHtml +='<li><a href="javascript:void(0);" id="modify_img"><i class="ico ico-1"></i>我的头像</a> </li>';
				  leftMenuHtml +='<li class="current"><a href="javascript:void(0);" id="in_modifyInfo"><i class="ico ico-2"></i>基本资料</a></li>';
				  /*leftMenuHtml +='<li><a href="javascript:void(0);"><i class="ico ico-3"></i>详细资料</a> </li>';*/
				  leftMenuHtml +='<li><a href="javascript:void(0);"><i class="ico ico-4"></i>帐号绑定</a> </li>';
				  leftMenuHtml +=' <li><a href="javascript:void(0);"><i class="ico ico-5"></i>应用授权</a> </li>';  
				  leftMenuHtml +='<li><a href="javascript:void(0);"><i class="ico ico-6"></i>我的硬件</a> </li>';  
				  leftMenuHtml +='</ul>'; 
				  leftMenuHtml +='</div>';  
				  
				  return leftMenuHtml;
				  
			  },
			  /**
			   * 账户安全获取左侧菜单
			   * @author jermmy
			   */
			  getLeftSafeMunu:function(){
				  var leftMenuHtml = '<div class="aside-menu">';
				  leftMenuHtml +='<ul id="safe_li_list">';
				  leftMenuHtml +='<li class="current" id="in_modify"><a href="javascript:void(0);"><i class="ico ico-1"></i>修改密码</a> </li>';
				  leftMenuHtml +='<li><a href="javascript:void(0);" id="in_setEmail"><i class="ico ico-3"></i>登录邮箱</a> </li>';
				  leftMenuHtml +='<li><a href="javascript:void(0);" id=""><i class="ico ico-3"></i>账户卫士</a> </li>';
				  leftMenuHtml +='<li><a href="javascript:void(0);" id=""><i class="ico ico-3"></i>账户锁定</a> </li>';
				  leftMenuHtml +='</ul>'; 
				  leftMenuHtml +='</div>';  
				  return leftMenuHtml;
			  },
			  
			  getInfoDetailHtml:function(){
				  
				  var detailHtml = "";
				  
				  
			  }
			  
			  
			  
	  };
	
	  
	  
}(sy || {}));


