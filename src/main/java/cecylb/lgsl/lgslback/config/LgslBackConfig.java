package cecylb.lgsl.lgslback.config;

import cecylb.lgsl.lgslback.utils.GeneratorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("cecylb.lgsl.lgslback")
public class LgslBackConfig {

    @Bean
    @Scope("singleton")
    @PostConstruct
    public GeneratorService generator() {
        return new GeneratorService();
    }
}
