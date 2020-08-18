package cecylb.lgsl.lgslback.model;

import org.springframework.stereotype.Component;

@Component
public class TTR implements Element {
    @Override
    public String template() {
        return "TTR";
    }
}
