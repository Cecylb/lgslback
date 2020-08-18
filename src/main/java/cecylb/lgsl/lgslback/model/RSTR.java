package cecylb.lgsl.lgslback.model;

import org.springframework.stereotype.Component;

@Component
public class RSTR implements Element {
    @Override
    public String template() {
        return "RSTR";
    }
}
