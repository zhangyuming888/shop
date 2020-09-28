package cn.bdqn.controller;

import cn.bdqn.domain.Manage;
import cn.bdqn.service.ManageService;
import cn.bdqn.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/*
* 登录相关的控制器
* */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    ManageService manageService;
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
    public String tologin(Manage manage, HttpServletRequest request){
        System.out.println(manage);
        Manage byEntity = manageService.getByEntity(manage);
        System.out.println(byEntity);
        if(byEntity==null){
            return "redirect:/login/mtuichu";
        }
        request.getSession().setAttribute(Consts.MANAGE,byEntity);
        return "/login/mIndex";
    }

    /**
     * 退出管理员
     * */
    @RequestMapping("/mtuichu")
    public String mtuichu(HttpServletRequest request){
        request.getSession().setAttribute(Consts.MANAGE,null);

        return "/login/mlogin";
    }
}
