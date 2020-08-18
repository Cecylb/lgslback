package cecylb.lgsl.lgslback.utils;

import cecylb.lgsl.lgslback.model.Element;

import java.util.List;

public final class Generator {

    public static String generate(List<Element> elements,
                                  String model) {
        return elements.stream().filter(element -> model.equals(element.getClass().getSimpleName())).findAny().orElse(null).template();
    }
}
