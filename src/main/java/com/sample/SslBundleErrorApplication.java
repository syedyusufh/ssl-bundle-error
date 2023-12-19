package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:/com/sample/config/common_application.properties")
@SpringBootApplication
public class SslBundleErrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslBundleErrorApplication.class, args);
	}

}
