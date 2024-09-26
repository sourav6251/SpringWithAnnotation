package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
@Configuration
@ComponentScan(basePackages = "com.annotation")
@PropertySource("classpath:info.properties")
public class ConfiguratioN {

    @Value("${A.amount}")
    public int A_amount;

    @Value("${B.amount}")
    public int B_amount;

    @Value("${C.amount}")
    public int C_amount;


    @Bean
    public ProjectManager configurationBean(Service service) {
        ProjectManager projectManager = new ProjectManager();
        projectManager.setService(service);
        return projectManager;
    }
    @Bean
    public Service service() {
        Service service;// = null;// = null;
        if (A_amount > B_amount) {
            if (A_amount < C_amount) {
                service = new TeamA();
            } else {
                service = new TeamC();
            }
        } else {
            if (B_amount > C_amount) {
                service = new TeamB();
            } else {
                service = new TeamC();
            }
        }
        return service;
    }
}



//
//
//package com.annotation;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//@Configuration
//@ComponentScan(basePackages = "com.annotation")
//@PropertySource("classpath:info.properties")
//public class ConfiguratioN {
//
//    @Value("${A.amount}")
//    public int A_amount;
//
//    @Value("${B.amount}")
//    public int B_amount;
//
//    @Value("${C.amount}")
//    public int C_amount;
//
//    @Bean
//    public Service service() {
//        Service service;
//        if (A_amount > B_amount) {
//            if (A_amount > C_amount) {
//                System.out.println("Selected Team: A, Amount: " + A_amount);
//                service = new TeamA();
//            } else {
//                System.out.println("Selected Team: C, Amount: " + C_amount);
//                service = new TeamC();
//            }
//        } else {
//            if (B_amount > C_amount) {
//                System.out.println("Selected Team: B, Amount: " + B_amount);
//                service = new TeamB();
//            } else {
//                System.out.println("Selected Team: C, Amount: " + C_amount);
//                service = new TeamC();
//            }
//        }
//        return service;
//    }
//
//    @Bean
//    public ProjectManager ConfigurationBean(Service service) {
//        ProjectManager projectManager = new ProjectManager();
//        projectManager.setService(service);  // Use setter injection to set the service
//        return projectManager;
//    }
//}
