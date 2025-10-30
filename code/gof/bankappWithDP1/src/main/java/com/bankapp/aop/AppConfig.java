package com.bankapp.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.bankapp.aop")
@EnableAspectJAutoProxy
public class AppConfig {

}
