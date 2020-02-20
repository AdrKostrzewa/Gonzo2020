package pl.adrian.gonzo2020;

import models.Data;
import models.Relation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GonzoController {

    @GetMapping("/")
    public String get(Model model) {
        Data data = new Data("Adrian","Kostrzewa", 18);
        Data data2 = new Data("Marcin","Rasiak", 24);
        Relation relation = new Relation();
        model.addAttribute("data", data);
        model.addAttribute("data2", data2);
        model.addAttribute("relation", relation);
        return "index";
    }
}
