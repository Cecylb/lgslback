package cecylb.lgsl.lgslback.model;

import cecylb.lgsl.lgslback.model.props.Label;
import org.springframework.stereotype.Component;

@Component
public class RSTR extends Element {

    @Override
    public Element construct() {
        return null;
    }

    @Override
    public Element template() {
        Element rstr = new RSTR();
        rstr.setX(2.0);
        rstr.setY(4.0);
        rstr.setLabel(new Label(RSTR.class.getSimpleName(), 1.0, 1.0));
        return rstr; }
}
