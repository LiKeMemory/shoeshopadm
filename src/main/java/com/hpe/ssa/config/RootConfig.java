package com.hpe.ssa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.hpe.ssa.config","com.hpe.ssa.mapper","com.hpe.ssa.service"})
@Import(C3p0DataSourceConfig.class)
public class RootConfig {
//    @Bean
//    public BeanNameAutoProxyCreator proxycreate(){
//        BeanNameAutoProxyCreator proxycreate = new BeanNameAutoProxyCreator();
//        proxycreate.setProxyTargetClass(true);
//        proxycreate.setBeanNames("*ServiceImpl");
//        proxycreate.setInterceptorNames("transactionInterceptor");
//        return proxycreate;
//    }
}
