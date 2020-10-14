package com.dist.xdata.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <pre>
 * 1.
 * </pre>
 *
 * @author weifj
 * @version 1.0.0
 * @date 2020/10/14 10:52
 */
@EnableFeignClients(basePackages = "com.dist.xdata.user.consumer")
@SpringBootApplication
public class CloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerApplication.class, args);
    }
}
