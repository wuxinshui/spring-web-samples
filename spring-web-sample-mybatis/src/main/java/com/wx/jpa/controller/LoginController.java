package com.wx.jpa.controller;

/**
 * Copyright [2017$] [Wuxinshui]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.wx.jpa.entities.User;
import com.wx.jpa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by wuxinshui on 2017/1/10.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping(method= RequestMethod.GET,value = {"/"})
    public String index(){
        return "login";
    }

    /**
     * 跳转到登陆页面
     * @return
     */
    @RequestMapping(value = {"/toLogin"})
    public String toLogin(){
        return "login";
    }

    /**
     *d登陆逻辑
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(method = RequestMethod.POST,value = "/login")
    public String login(Model model, HttpServletRequest request){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        User user=new User(username,password,new Date(),"");
        userService.save(user);
        model.addAttribute("username",request.getParameter("username"));
        return "index";
    }

}
