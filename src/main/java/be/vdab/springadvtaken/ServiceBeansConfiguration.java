package be.vdab.springadvtaken;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeansConfiguration {
    @Bean
    WoordService woordServiceBean() {
        return new WoordService();
    }
}
