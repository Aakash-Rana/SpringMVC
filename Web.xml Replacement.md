
Java based replacement of Web.xml

````
package com.registration.config;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
// From XML		
//		 XmlWebApplicationContext webApplicationContext=new XmlWebApplicationContext();
//		 webApplicationContext.setConfigLocation("classpath:Application-Config.xml");

		 
// From Java Configuration
		AnnotationConfigWebApplicationContext webApplicationContext= new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(ApplicationConfiguration.class);
		
		 
		// create a dispatcher servlet object
		 DispatcherServlet dispatcherServlet= new DispatcherServlet(webApplicationContext);
		 
		 // register dispatcher servlet object with servlet context
		 
		Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		 
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/home/*");
		 
		System.out.println("Running ApplicationIntializer");
	}

} 
 


````
 
