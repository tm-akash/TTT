package com.niit.mapper.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AppConfig.class} ;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

	/*@Override
	public void onStartup(ServletContext arg0) throws ServletException {
        WebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");
		
	}

	   private AnnotationConfigWebApplicationContext getContext() {
	        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	        context.setConfigLocation("eu.kielczewski.example.config");
	        return context;
	    }*/
}
