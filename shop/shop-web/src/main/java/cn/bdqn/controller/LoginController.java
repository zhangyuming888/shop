package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*
* 登录相关的控制器
* */
@Controller
@RequestMapping("/login")
public class LoginController {

    /**
     * 管理员登录前
     * */
    @RequestMapping("/mlogin")
    public String mlogin(){
        return "/login/mlogin";
    }
    /**
     * 登录验证
     * */
    @RequestMapping("/tologin")
    public String tologin(){
        System.out.println("登录请求");
        return "/login/mlogin";
    }
}
