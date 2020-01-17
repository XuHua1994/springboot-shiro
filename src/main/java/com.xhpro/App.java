package com.xhpro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 启动类
 *
 * @author xh
 * @since 2020-01-16
 */

@SpringBootApplication
@MapperScan(value = "con.xhpro.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
