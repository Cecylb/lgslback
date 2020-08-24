package cecylb.lgsl.lgslback.model.props;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Port {

    public enum Type {
        INPUT,
        OUTPUT
    }

    private String name;
    private boolean isMultipliable;
    private boolean isInverse;
    private Type type;

}
