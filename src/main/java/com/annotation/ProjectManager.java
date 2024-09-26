package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//("manager")
public class ProjectManager {

    @Value("${Development}")
    public String development;

    public Service service;

    public void setService(Service service) {
        this.service = service;
    }

    @Value("${projectName}")
    private String projectName;

    public void project(){
        System.out.println("Your Project name is: "+projectName);
        service.teamName();

        if(development.equalsIgnoreCase("appDevelopment")){
            service.appDevelopment();
        }
        else {
            service.webDevelopment();
        }

    }


}
