package cecylb.lgsl.lgslback.model;

import cecylb.lgsl.lgslback.model.props.Label;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class MX extends Element {

    private int inputs; //количество входов

    @Override
    public Element construct() {
        return null;
    }

    @Override
    public Element template() {
        Element mx = new MX();
        mx.setX(2.0);
        mx.setY(4.0);
        mx.setLabel(new Label(MX.class.getSimpleName(), 1.0, 1.0));
        mx.setAmountDynamic(true);
        mx.setInputAmount(1);
        return mx;
    }
}
