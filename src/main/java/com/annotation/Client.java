package com.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfiguratioN.class);
        ProjectManager project=context.getBean("configurationBean",ProjectManager.class);

        project.project();
    }
}
