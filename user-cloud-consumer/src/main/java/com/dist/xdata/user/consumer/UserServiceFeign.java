package com.dist.xdata.user.consumer;

import com.dist.xdata.user.api.UserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <pre>
 * 1.定义消费者客户端
 * </pre>
 *
 * @author weifj
 * @version 1.0.0
 * @date 2020/10/14 9:42
 */
@FeignClient(name = "user-service-provider")
public interface UserServiceFeign extends UserService {
}