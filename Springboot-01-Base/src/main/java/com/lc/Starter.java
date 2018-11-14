package com.lc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication//springboot启动器注解
@ServletComponentScan//servlet(servlet,filter,listener)相关注解扫描
@MapperScan("com.lc.mapper")//扫描mapper接口
@EnableTransactionManagement//开启事务管理注解驱动
@EnableAspectJAutoProxy//开启AspectJ注解驱动
public class Starter {
public static void main(String[] args) {
	SpringApplication.run(Starter.class, args);
}
}
