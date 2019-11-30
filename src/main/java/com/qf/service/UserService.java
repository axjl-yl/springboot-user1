package com.qf.service;

import com.qf.Response.UserResponse;
import com.qf.domain.User;

import java.util.List;

/**
 * Created by 嘉宇 on 2019/11/27.
 */
public interface UserService {
   UserResponse findAll(Integer size, Integer page);
    User findById(Integer id);
    User saveAndFlush(User user);
    String deleteById(User user);
}
