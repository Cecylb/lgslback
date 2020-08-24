package cecylb.lgsl.lgslback.model;

import cecylb.lgsl.lgslback.model.props.Form;
import cecylb.lgsl.lgslback.model.props.Label;
import cecylb.lgsl.lgslback.model.props.Port;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Element {

    private int id = 0;
    private List<Port> ports = new ArrayList<>();
    private Label label = new Label("", 0.0, 0.0);
    private Form form = Form.NON;
    private double x = 0.0;
    private double y = 0.0;

    public abstract String template();

}
