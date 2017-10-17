package com.mikespider.springbootMagic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
 * @author mike_yi
 * @since  2017-10-17
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.mikespider.api.urlApi")).paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Spring Boot")
				.licenseUrl("www.baidu.com")
				.description("webmagic api")
				.termsOfServiceUrl("http://blog.didispace.com/").contact("mikeyi").version("1.0").build();
	}

}
