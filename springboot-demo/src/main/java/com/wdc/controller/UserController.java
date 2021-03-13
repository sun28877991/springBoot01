package com.wdc.controller;

import com.wdc.model.User;
import com.wdc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RequestMapping("/user")
//@RestController//它是@Controller和@ResponseBody的合体，加在这里表示所有的返回值都是json
public class UserController {//classpath是根目录，这里根目录是resources
    //themeleft（西木立夫）里面的th:XXX标签使用，<html lang="en" xmlns:th="http://www.thymeleaf.org">来实现引用themeleft的标签
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
//    @ResponseBody
    public String hello(){
        return "hello springboot";
    }

    @RequestMapping("queryUserList")//查询功能
    public String queryUserList(Model m){
        List<User> list=userService.queryUserList();
        m.addAttribute("list",list);
        return "ShowUser";
    }
    @RequestMapping("toAdd")//@postmapping,deletemapping,putmapping,getmapping,对应增删改查
    public String toAdd(){
        return "addUser";
    }
    @RequestMapping("addUser")
    public String addUser(User user){
        System.out.println(user);
        userService.addUser(user);
        return "redirect:queryUserList";
    }
    @RequestMapping("delUser")
    public String delUser(Integer id){
        userService.delUser(id);
        return "redirect:queryUserList";
    }


    @RequestMapping("toUpdateUser")
    public String toUpdateUser(Integer id,Model m){
        User user=userService.toUpdateUser(id);
        m.addAttribute("u",user);
        return "updateUser";
    }

    @RequestMapping("updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:queryUserList";
    }

}
