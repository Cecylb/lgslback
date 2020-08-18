package cecylb.lgsl.lgslback.web;

import cecylb.lgsl.lgslback.model.Element;
import cecylb.lgsl.lgslback.utils.Generator;
import cecylb.lgsl.lgslback.utils.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class EditorController {

    @Autowired
    private List<Element> elements;

    @GetMapping("/editor")
    Collection<String> getReaction() { return elements.stream().map(element -> element.getClass().getSimpleName()).collect(Collectors.toList()); }

    @GetMapping("/editor/{model}")
    String getModel (@PathVariable String model) { return Generator.generate(elements, model); }

    @PostMapping("/editor/submit")
    public @ResponseBody byte[] process(@Valid @RequestBody String input) { return Translator.translate(input); }
}
