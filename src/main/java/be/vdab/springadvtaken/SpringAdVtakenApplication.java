package be.vdab.springadvtaken;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAdVtakenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAdVtakenApplication.class, args);
    }

    @Bean
    OpenAPI openAPI() {
        return new OpenAPI().info(new Info()
                .title("Palindroom")
                .version("1.0.0")
                .description("Bepalen of een woord een palindroom is"));
    }

}
