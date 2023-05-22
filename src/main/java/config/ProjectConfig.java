package config;

import main.Human;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Human human(){
        var boi = new Human();
        boi.setName("Dylan");
        return boi;
    }
    //Refer to this bean using its human2 label as Spring needs a way to identify which bean we wish to use by adding it as a parameter in the getBean() command
    @Bean
    Human human2(){
        Human gurl = new Human();
        gurl.setName("Helene");
        return gurl;
    }

    //Setting custom Bean name
    @Bean("Karlito")
    Human human3(){
        Human bruh = new Human();
        bruh.setName("Karlito");
        return bruh;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
