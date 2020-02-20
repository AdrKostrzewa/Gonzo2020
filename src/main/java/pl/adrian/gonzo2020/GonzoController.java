package pl.adrian.gonzo2020;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GonzoController {

    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("name", "Adrian");
        return "index";
    }
}
