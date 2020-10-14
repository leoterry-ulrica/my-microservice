package com.dist.xdata.user.impl;

import com.dist.xdata.user.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * 1.
 * </pre>
 *
 * @author weifj
 * @version 1.0.0
 * @date 2020/10/14 9:42
 */
@RestController
@RequestMapping("/")
public class UserServiceImpl implements UserService {

    @Override
    public String getUser(Long userId) {
        return "SpringCloud实现，当前用户信息：" + userId;
    }
}
