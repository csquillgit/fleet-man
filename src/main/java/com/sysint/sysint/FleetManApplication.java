package com.sysint.sysint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.sysint.sysint", "com.core.core", "com.facade1.facade1", "com.facade2.facade2" })
public class FleetManApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetManApplication.class, args);
	}
}
