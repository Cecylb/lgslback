package cecylb.lgsl.lgslback.model;

import org.springframework.stereotype.Component;

@Component
public class MX implements Element {
    @Override
    public String template() {
        return "MX";
    }
}
