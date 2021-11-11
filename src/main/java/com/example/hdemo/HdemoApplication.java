package com.example.hdemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HdemoApplication {

    public static void main(String[] args) {
        /*

        取消显示启动界面
        /
         */
//        SpringApplication springApplication =new SpringApplication(HdemoApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);
        SpringApplication.run(HdemoApplication.class, args);
    }

}
