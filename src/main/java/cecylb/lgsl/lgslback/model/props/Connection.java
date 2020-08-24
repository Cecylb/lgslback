package cecylb.lgsl.lgslback.model.props;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Connection {
    //from and to elements' ids
    private int from;
    private String portFrom; //ToDo придумать как идентифицировать порты
    private int to;
    private String portTo;
}
