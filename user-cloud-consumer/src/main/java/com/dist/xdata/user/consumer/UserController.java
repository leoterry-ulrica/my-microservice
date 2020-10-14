package com.dist.xdata.user.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <pre>
 * 1.
 * </pre>
 *
 * @author weifj
 * @version 1.0.0
 * @date 2020/10/14 10:46
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @RequestMapping("/getUser")
    public String getUser(@RequestParam("id") Long userId) {
        String resp = this.userServiceFeign.getUser(userId);
        return ">>>SpringCloud消费者openfegin调用，返回：" + resp;
    }
}
