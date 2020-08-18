package cecylb.lgsl.lgslback.model;

import org.springframework.stereotype.Component;

@Component
public class DTR implements Element {
    @Override
    public String template() {
        return "DTR";
    }
}
