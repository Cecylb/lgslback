package cecylb.lgsl.lgslback.model;

import cecylb.lgsl.lgslback.model.props.Label;
import org.springframework.stereotype.Component;

@Component
public class DTR extends Element {

    @Override
    public Element construct() {
        return null;
    }

    @Override
    public Element template() {
        Element dtr = new DTR();
        dtr.setX(2.0);
        dtr.setY(4.0);
        dtr.setLabel(new Label(DTR.class.getSimpleName(), 1.0, 1.0));
        return dtr;
    }
}
