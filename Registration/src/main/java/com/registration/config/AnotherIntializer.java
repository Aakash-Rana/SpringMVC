package com.registration.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AnotherIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {ApplicationConfiguration.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String [] mappingStrings= {"/*"};
		return mappingStrings;
	}

}
