package com.in1.boot.config;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletsConfig {

	@Bean
	public ServletRegistrationBean strutsActionServlet() {
		
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
		servletRegistrationBean.setServlet(new ServletWrapper());
		servletRegistrationBean.setLoadOnStartup(10);
		servletRegistrationBean.setName("StrutsServlet");
		servletRegistrationBean.addUrlMappings("*.do");

		servletRegistrationBean.addInitParameter("config",
				"/WEB-INF/struts-config.xml");
		return servletRegistrationBean;
	}
	
}
