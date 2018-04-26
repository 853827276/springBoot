package com.zhangheng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhangheng.common.BaseController;
import com.zhangheng.entity.User;
import com.zhangheng.service.UserService;

/**
 * user 管理层
 * 
 * @author zhangh
 *
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User, UserService<User>, Integer> {
}
