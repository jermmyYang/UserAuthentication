package cn.com.sy.controller;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.sy.entity.UserJsonDto;
import cn.com.sy.service.UserService;
import cn.com.sy.util.WebUtils;

import javax.servlet.http.HttpServletResponse;


/**
 * @author Shengzhao Li
 */
@Controller
@RequestMapping("/unity/")
public class UnityController {


    @Autowired
    private UserService userService;


    @RequestMapping("dashboard.htm")
    public String dashboard() {
        return "unity/dashboard";
    }

   /* @RequestMapping("user_info")
    public void userInfo(HttpServletResponse response) throws Exception {
        final UserJsonDto jsonDto = userService.loadCurrentUserJsonDto();
        WebUtils.writeJson(response, JSONObject.fromObject(jsonDto));
    }*/

}