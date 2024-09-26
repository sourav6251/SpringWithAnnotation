package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class TeamB implements Service{
    @Value("${B.amount}")
    public int amount;
    @Value("${B.time=}")
    public int time;
    @Value("${B.TeamMember}")
    public int TeamMember;


    @Override
    public void webDevelopment() {
        System.out.println("No of Team Member: "+TeamMember);
        System.out.println("Project finish Time: "+time+"months");
        System.out.println("Amount: "+amount);

    }

    @Override
    public void appDevelopment() {
        System.out.println("No of Team Member: "+TeamMember);
        System.out.println("Project finish Time: "+time+"months");
        System.out.println("Amount: "+amount);

    }

    @Override
    public void teamName() {
        System.out.println("Team name is: BBB ");

    }
}
