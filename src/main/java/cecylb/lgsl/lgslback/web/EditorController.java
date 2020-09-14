package cecylb.lgsl.lgslback.web;

import cecylb.lgsl.lgslback.config.LgslBackConfig;
import cecylb.lgsl.lgslback.utils.GeneratorService;
import cecylb.lgsl.lgslback.utils.Translator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/api")
public class EditorController {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LgslBackConfig.class);

    @GetMapping("/editor")
    Collection<String> getElements() { return context.getBean("generator", GeneratorService.class).getElementsString();}

    @GetMapping("/editor/{model}")
    String getTemplate(@PathVariable String model) { return context.getBean("generator", GeneratorService.class).generate(model); }

    @PostMapping("/editor/submit")
    public @ResponseBody byte[] processSubmit(@Valid @RequestBody String input) { return Translator.translate(input); }
}
