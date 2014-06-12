package com.in1.boot;


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration(exclude = {DataSourceTransactionManagerAutoConfiguration.class})
@Configuration
@ComponentScan(basePackages={"com.in1"})
public class SampleApplication {
	
	private static Logger LOG = Logger.getLogger(SampleApplication.class);

	public static void main(String[] args) throws Exception {
		
		LOG.info("\n-----------\nmain() Thread ContextClassLoader: "+Thread.currentThread().getContextClassLoader()+"\n-----------\n");
		
		ApplicationContext ctx = SpringApplication.run(SampleApplication.class, args);
		
		
	}
}