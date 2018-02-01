package com.jcfc.microservice.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.stream.SleuthStreamAutoConfiguration;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * 分布式服务调用链跟踪服务端
 *
 * @author zhangjinpeng
 * @version 1.0
 * @Date 2017/12/29
 */

@EnableZipkinStreamServer
@SpringBootApplication(exclude = SleuthStreamAutoConfiguration.class)
public class ZipkinServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServiceApplication.class, args);
    }
}
