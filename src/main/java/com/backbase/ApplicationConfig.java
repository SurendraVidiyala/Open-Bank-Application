package com.backbase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Java based configuration file
 * 
 * @author Arka Bhattacharya
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.backbase")
//@PropertySource("app.properties")
public class ApplicationConfig {

	/*@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}*/
}
