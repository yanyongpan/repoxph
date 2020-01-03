package com.xph.govern.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by WSJ on 2019/12/17
 * Created by WSJ on 2019/12/17
 */
@EnableEurekaServer //标识此工程是一个EurekaServer 注册中心服务
@SpringBootApplication
public class GovernCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(GovernCenterApplication.class,args);
    }
}
