package cecylb.lgsl.lgslback.model;

import cecylb.lgsl.lgslback.model.props.Label;
import org.springframework.stereotype.Component;

@Component
public class TTR extends Element {

    @Override
    public Element construct() {
        return null;
    }

    @Override
    public Element template() {
        Element ttr = new TTR();
        ttr.setX(2.0);
        ttr.setY(4.0);
        ttr.setLabel(new Label(TTR.class.getSimpleName(), 1.0, 1.0));
        return ttr;
    }
}
