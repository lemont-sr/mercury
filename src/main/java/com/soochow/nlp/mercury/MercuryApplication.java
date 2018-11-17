package com.soochow.nlp.mercury;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.soochow.nlp.mercury.**"})
@MapperScan(basePackages = {"com.soochow.nlp.mercury.mapper"})
@Configuration
@EnableAutoConfiguration
@ServletComponentScan
public class MercuryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercuryApplication.class, args);
    }
}
