package com.qianfeng.springboothello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1，SpringBoot减少了繁琐的配置，提高构建一个项目的效率
 * 2，Starter就是对一些坐标做了封装，然后以场景的方式划分，比如开发web应用，那么就导入starter-web.
 * 3, SpringBoot通过parent工程来统一管理第三方的版本，当我们需要变更版本的时候，只需要更换SpringBoot的版本即可
 */
@SpringBootApplication
public class SpringbootHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloApplication.class, args);
	}

}
