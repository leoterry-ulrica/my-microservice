package com.dist.xdata.user.consumer;

import com.dist.xdata.user.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * 1.
 * </pre>
 *
 * @author weifj
 * @version 1.0.0
 * @date 2020/10/14 12:21
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Reference
    private UserService userService;
    @RequestMapping("/getUser")
    public String getUser(@RequestParam("id") Long userId) {
        String resp = this.userService.getUser(userId);
        return ">>>Dubbo消费者调用，返回：" + resp;
    }
}
