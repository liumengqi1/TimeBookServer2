package com.ssh.dao;

import com.ssh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,String> {
    List<User> findAll();
}
