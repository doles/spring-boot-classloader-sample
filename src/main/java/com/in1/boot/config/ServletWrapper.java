package com.in1.boot.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionServlet;


public class ServletWrapper extends ActionServlet {

	private static final long serialVersionUID = 1L;
	
	private static Logger LOG = Logger.getLogger(ServletWrapper.class);
	
	@Override
	public void init() throws ServletException {
		
		LOG.info("\n-----------\ninit() Thread ContextClassLoader: "+Thread.currentThread().getContextClassLoader()+"\n-----------\n");
		
		super.init();
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		LOG.info("\n-----------\ndoGet() Thread ContextClassLoader: "+Thread.currentThread().getContextClassLoader()+"\n-----------\n");
		
		super.doGet(request, response);
	}
	
}
