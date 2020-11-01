package com.shy.service;

import com.shy.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: shy
 * @Date: 2020/10/27/19:02
 * @Description:
 */

public interface UserService {
    //核对用户名和密码
    User checkUser(String username, String password);
}
