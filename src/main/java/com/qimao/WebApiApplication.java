package com.qimao;

import com.qimao.dao.Interceptor.MySqlDataInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.qimao"})
@MapperScan(basePackages = {"com.qimao.dao"})
public class WebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
	}

	@Bean
	public MySqlDataInterceptor mySqlDataInterceptor(){
		return new MySqlDataInterceptor();
	}
}
