package com.shixun.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.sql.DataSource;
import javax.xml.crypto.Data;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ProjectApplication extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProjectApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
