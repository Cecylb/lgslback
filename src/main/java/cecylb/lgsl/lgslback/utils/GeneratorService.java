package cecylb.lgsl.lgslback.utils;

import cecylb.lgsl.lgslback.model.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public final class GeneratorService {

    @Autowired
    private List<Element> elements;

    public List<String> getElementsString() {
        return elements.stream().map(element -> element.getClass().getSimpleName()).collect(Collectors.toList());
    }

    public String generate(String model) {
        //ToDo придумать как делать темплейты без хардкода
        Element template = elements.stream().filter(element -> model.equals(element.getClass().getSimpleName())).findAny().orElse(null).template();
        return "new " + template.getClass().getSimpleName() + " {\n" +
                "size: " + template.getX() + ", " + template.getY() + ";\n" +
                "label: " + template.getLabel().getName() + ", " + template.getLabel().getX() + ", " + template.getLabel().getY() + ";\n" +
                (template.isAmountDynamic() ? "inputs: " + template.getInputAmount() + ";\n" : "") +
                "}";
    }
}
