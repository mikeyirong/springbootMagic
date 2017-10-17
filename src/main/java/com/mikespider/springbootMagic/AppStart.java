package com.mikespider.springbootMagic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;



@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.mikespider")
@ImportResource(value="classpath:/applicationContext.xml")
public class AppStart {
  public static void main(String[] args) {
	SpringApplication.run(AppStart.class,args);
}
}
