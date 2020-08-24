package cecylb.lgsl.lgslback.utils;

import cecylb.lgsl.lgslback.model.Element;

import java.util.List;

public final class Generator {

    public static String generate(List<Element> elements,
                                  String model) {
        //ToDo придумать как делать темплейты без хардкода
        Element template = elements.stream().filter(element -> model.equals(element.getClass().getSimpleName())).findAny().orElse(null).template();
        return "new " + template.getClass().getSimpleName() + " {\n" +
                "size: " + template.getX() + ", " + template.getY() + ";\n" +
                "label: " + template.getLabel().getName() + ", " + template.getLabel().getX() + ", " + template.getLabel().getY() + ";\n" +
                (template.isAmountDynamic() ? "inputs: " + template.getInputAmount() + ";\n" : "") +
                "}";
    }
}
