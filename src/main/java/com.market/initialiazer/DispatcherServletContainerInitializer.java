//package com.market.initialiazer;
//
//import com.market.configuration.WebConfiguration;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContainerInitializer;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//import java.util.Set;
//
//public class DispatcherServletContainerInitializer implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.register(WebConfiguration.class);
//
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
//
//        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
//        servletRegistration.setLoadOnStartup(1);
//        servletRegistration.addMapping("/");
//    }
//}
