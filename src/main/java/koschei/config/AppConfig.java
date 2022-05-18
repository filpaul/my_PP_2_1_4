package koschei.config;

import koschei.models.Egg6;
import koschei.models.Needle7;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Egg6 getEgg(Needle7 needle) {
        return new Egg6(needle);
    }
}