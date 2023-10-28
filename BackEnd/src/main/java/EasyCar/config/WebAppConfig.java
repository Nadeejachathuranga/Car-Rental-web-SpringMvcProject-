package EasyCar.config;

import EasyCar.controller.customerController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"EasyCar.controller","EasyCar.advisor"})
@ComponentScan(basePackageClasses = {customerController.class})
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("WebAppConfig:Web App Instantiated");
    }
}
