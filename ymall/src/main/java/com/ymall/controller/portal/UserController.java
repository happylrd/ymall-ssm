package com.ymall.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/")
public class UserController {

    @PostMapping(value = "login.do")
    @ResponseBody
    public Object login(String username, String password, HttpSession session) {

        return null;
    }
}
