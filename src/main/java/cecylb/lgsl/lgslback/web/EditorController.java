package cecylb.lgsl.lgslback.web;

import cecylb.lgsl.lgslback.utils.GeneratorService;
import cecylb.lgsl.lgslback.utils.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/api")
public class EditorController {

    @Autowired
    private GeneratorService generator;

    @GetMapping("/editor")
    Collection<String> getElements() { return generator.getElementsString();}

    @GetMapping("/editor/{model}")
    String getTemplate(@PathVariable String model) { return generator.generate(model); }

    @PostMapping("/editor/submit")
    public @ResponseBody byte[] processSubmit(@Valid @RequestBody String input) { return Translator.translate(input); }
}
