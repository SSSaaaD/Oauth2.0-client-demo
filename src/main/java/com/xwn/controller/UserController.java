package com.xwn.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xwn
 * @date 2021/1/9 16:04
 */


@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/getUserInfo")
    public Object getUserInfo(Authentication authentication){
        return authentication;
    }
}
