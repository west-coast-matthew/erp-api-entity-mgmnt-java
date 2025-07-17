package com.wc_matthew.demo.erp.entity_mgmnt;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@ComponentScan(basePackages = {"com.wc_matthew.demo.erp.*"})
// @EnableWebSecurity
public class AppConfiguration {
	
	@Value("${db.DB_USERNAME}")
	private String dbUserName;
	
	@Value("${db.DB_PASSWORD}")
	private String dbPassword;
	
	@Value("${db.DB_URL}")
	private String dbHost;

	@Value("${db.DB_PASSWORD}")
	private String driverClassName;
	
	@Bean
	public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();

	    dataSource.setDriverClassName(driverClassName);
	    dataSource.setUsername(dbUserName);
	    dataSource.setPassword(dbPassword);
	    dataSource.setUrl(dbHost); 
	    
	    return dataSource;
	}
	
	/*
	protected void configure(HttpSecurity security) throws Exception
    {
		todo: enable security at some future point
    }*/
	

}
