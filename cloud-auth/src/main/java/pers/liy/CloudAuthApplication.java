package pers.liy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Prock.Liy
 * @Date 2020/9/14 21:58
 * @Description 启动类
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class CloudAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAuthApplication.class, args);
    }

}