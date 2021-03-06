package com.mikespider.springbootMagic.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 * druid配置类
 * 
 * @author mike_yi
 *
 */
@Configuration
public class DruidDatasourceConfiguration {
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druidDataSource() {
		DruidDataSource druidDatasource = new DruidDataSource();
		System.out.println(druidDatasource.getDriverClassName());
		return druidDatasource;
	}

	@Bean
	public ServletRegistrationBean dridServlet() {
		ServletRegistrationBean reg = new ServletRegistrationBean();
		reg.setServlet(new StatViewServlet());
		reg.addUrlMappings("/druid/*");
		reg.addInitParameter("loginUsername", "mike");
		reg.addInitParameter("loginPassword", "123456");
		return reg;
	}
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
	FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
	filterRegistrationBean.setFilter(new WebStatFilter());
	filterRegistrationBean.addUrlPatterns("/*");
	filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
	filterRegistrationBean.addInitParameter("profileEnable", "true");
	filterRegistrationBean.addInitParameter("principalCookieName", "USER_COOKIE");
	filterRegistrationBean.addInitParameter("principalSessionName", "USER_SESSION");
	return filterRegistrationBean;
	}
}
