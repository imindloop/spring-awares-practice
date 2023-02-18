package com.mindloop.springawarespractice.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## 1. In the constructor of the LifeCycleDemoBean class.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## 2. My bean name is: " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3. The bean factory has been set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4. The Application Context has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## 5. In the PostConstruct function.");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 6. The lifecycle bean has finished setting the properties.");
    }


    @PreDestroy
    public void preDestroy() {
        System.out.println("## 7. At the preDestroy function.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 8. The life cycle has been terminated.");
    }
}
