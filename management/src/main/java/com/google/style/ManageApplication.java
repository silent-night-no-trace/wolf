package com.google.style;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author liangz
 * @date  2018/03/02 11:11
 *  管理系统
 */

@ComponentScan(basePackages={"com.google.*"})
@SpringBootApplication
public class ManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageApplication.class, args);
	}

}
