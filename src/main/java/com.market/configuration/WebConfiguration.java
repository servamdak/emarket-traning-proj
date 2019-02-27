//package com.market.configuration;
//
//import com.market.controllers.ProductController;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.accept.ContentNegotiationManager;
//import org.springframework.web.servlet.config.annotation.*;
//import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.UrlBasedViewResolver;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
////@EnableWebMvc
//@ComponentScan(basePackages = {"com.market.controllers"})
//public class WebConfiguration implements WebMvcConfigurer {
//
////    @Autowired
////    private ContentNegotiationManager contentNegotiationManager;
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {
//        resourceHandlerRegistry
//                .addResourceHandler("/resources/**")
//                .addResourceLocations("classpath:/static/");
//    }
//
////    @Override
////    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
////        Map<String, MediaType> mediatypes = new HashMap<>();
////        mediatypes.put("html", MediaType.TEXT_HTML);
//////        mediatypes.put("pdf", MediaType.valueOf("application/pdf"));
//////        mediatypes.put("xls", MediaType.valueOf("application/vnd.ms-excel"));
////        mediatypes.put("xml", MediaType.APPLICATION_XML);
////        mediatypes.put("json", MediaType.APPLICATION_JSON);
////        configurer.mediaTypes(mediatypes);
////    }
////    @Bean
////    public ContentNegotiatingViewResolver contentNegotiatingViewResolver() {
////        ContentNegotiatingViewResolver viewResolver = new ContentNegotiatingViewResolver();
////        viewResolver.setContentNegotiationManager(contentNegotiationManager);
////        return viewResolver;
////    }
//
////    @Override
////    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/").setViewName("home");
////    }
//
////    @Bean
////    public UrlBasedViewResolver urlViewResolver(){
////        UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
////        urlBasedViewResolver.setViewClass(ProductController.class);
////        urlBasedViewResolver.setContentType("text/html");
////        return urlBasedViewResolver;
////    }
//
//        @Bean
//    public InternalResourceViewResolver resourceViewResolver(){
//        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix("/resources/static/");
//        internalResourceViewResolver.setSuffix(".html");
//        return internalResourceViewResolver;
//    }
////
////    @Override
////    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
////        configurer.enable();
////    }
//}
