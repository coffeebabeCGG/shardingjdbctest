package com.cgg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author cgg
 * @version 1.0.0
 * @date 2021/10/25
 */
@SpringBootApplication
@EnableConfigurationProperties
public class ShardingJdbcApp {


    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApp.class, args);
    }

}
