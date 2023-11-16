package com.lit.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//4.定义一个servlet容器启动配置类，在里面加载spring的配置
public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {

    //加载springmvc容器的配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //定义并加载SpringMvc的信息
        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
        context.register(SpringMvcConfig.class);
        return context;
    }

    //设置那些请求归属于springmvc的管理
    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};//所有请求归属spring
    }
    //加载spring容器的配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
