package cecylb.lgsl.lgslback.config;

import cecylb.lgsl.lgslback.utils.GeneratorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LgslBackConfig {

    @Bean
    @Scope("singleton")
    public GeneratorService generator() {
        return new GeneratorService();
    }
}
