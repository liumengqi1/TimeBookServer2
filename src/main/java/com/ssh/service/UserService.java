package com.ssh.service;

import com.ssh.dao.UserDao;
import com.ssh.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDao exampleDao;

    public List<User> findAll(){
        return exampleDao.findAll();
    }
}
