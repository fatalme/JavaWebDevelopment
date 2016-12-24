package formlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by nm on 12/24/2016.
 */
@SpringBootApplication
public class BootStrap {
    /*
    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".view");
        return resolver;
    }
    */
    public static void main(String[] args){
        SpringApplication.run(BootStrap.class, args);
    }
}
