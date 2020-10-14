package com.dist.xdata.user.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {

    /**
     * 获取用户接口
     *
     * @param userId
     * @return
     */
    @GetMapping("/users/getUser")
    String getUser(@RequestParam("id") Long userId);
}