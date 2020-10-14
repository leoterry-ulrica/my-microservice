package com.dist.xdata.user.impl;

import com.dist.xdata.user.api.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * <pre>
 * 1.
 * </pre>
 *
 * @author weifj
 * @version 1.0.0
 * @date 2020/10/14 11:39
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser(Long userId) {
        return "Dubbo实现，当前用户信息：" + userId;
    }
}
