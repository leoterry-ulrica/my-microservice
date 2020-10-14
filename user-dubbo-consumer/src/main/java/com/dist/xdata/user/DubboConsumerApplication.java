package com.dist.xdata.user;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <pre>
 * 1.
 * </pre>
 *
 * @author weifj
 * @version 1.0.0
 * @date 2020/10/14 12:15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
