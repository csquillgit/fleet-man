package com.sysint.sysint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.sysint.sysint", "com.core.core", "com.facade1.facade1", "com.facade2.facade2" })
public class SysintApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysintApplication.class, args);
	}
}
