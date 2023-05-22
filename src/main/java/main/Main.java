package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    //main.Main method
    public static void main(String[] args){
        //Spring context object
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Human boi = context.getBean("Karlito", Human.class);
        String hello = context.getBean(String.class);
        Integer ten = context.getBean(Integer.class);
        System.out.println(boi.getName());
        System.out.println(hello);
        System.out.println(ten);
    }

}
