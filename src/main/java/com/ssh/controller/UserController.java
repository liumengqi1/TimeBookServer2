package com.ssh.controller;

import com.ssh.entity.User;
import com.ssh.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger LOG= LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService exampleService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        List<User> userList=exampleService.findAll();
        LOG.info("msg:{}",userList);
        return  userList;
    }
}
