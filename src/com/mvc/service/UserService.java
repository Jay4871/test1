package com.mvc.service;

import com.mvc.entity.User;

import java.util.List;

/**
 * @author jay.wang
 * @create 2019-07-16-9:22
 **/
public interface UserService {

  public List<User> getUser();

  public User getUserById();
}
