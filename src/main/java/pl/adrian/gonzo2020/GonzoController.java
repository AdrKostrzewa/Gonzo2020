package pl.adrian.gonzo2020;

import models.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GonzoController {

    @GetMapping("/")
    public String get(Model model) {
        Data data = new Data("Adrian","Kostrzewa");
        model.addAttribute("data", data);
        return "index";
    }
}
