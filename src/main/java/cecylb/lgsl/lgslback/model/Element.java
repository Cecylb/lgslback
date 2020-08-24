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
    private int inputAmount = 0;
    private boolean isAmountDynamic = false;
    private Form form = Form.NON;
    private double x = 0.0;
    private double y = 0.0;

    public abstract Element construct(); // Метод для сборки данных по элементу. ToDo скорее всего на вход будет приниматься ветка дерева

    public abstract Element template(); // Метод для создания темплейта по элементу. Работает с дефолтными значениями

}
