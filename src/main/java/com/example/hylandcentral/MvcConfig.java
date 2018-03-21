package com.example.hylandcentral;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer  {

	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/comments").setViewName("comments");
	}
	
	@Bean
    public MessageSource messageSource() {
    	final ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
    	
    	messageSource.setBasename("locale/messages");
    	messageSource.setDefaultEncoding("UTF-8");
    	
    	return messageSource;
    }
}
