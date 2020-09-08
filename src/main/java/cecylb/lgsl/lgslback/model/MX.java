package cecylb.lgsl.lgslback.model;

import cecylb.lgsl.lgslback.model.props.Label;
import org.springframework.stereotype.Component;

@Component
public class MX extends Element {

    public int inputs=1;

    @Override
    public Element construct() {
        return null;
    }

    @Override
    public MX template() {
        MX mx = new MX();
        mx.setX(2.0);
        mx.setY(4.0);
        mx.setLabel(new Label(MX.class.getSimpleName(), 1.0, 1.0));
        mx.setAmountDynamic(true);
        mx.setInputAmount(1);
        return mx;
    }
}
