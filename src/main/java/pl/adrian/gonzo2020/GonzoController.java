package pl.adrian.gonzo2020;

import models.Data;
import models.Relation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

@Controller
public class GonzoController {

    @GetMapping("/")
    public String get(Model model) {
        Data data = new Data("Adrian","Kostrzewa", 18);
        Data data2 = new Data("Marcin","Rasiak", 24);
        Data data3 = new Data("Zenon","Lemon", 30);
        Relation relation = new Relation();
        model.addAttribute("data", data);
        model.addAttribute("data2", data2);
        model.addAttribute("relation", relation);
        List<Data> list =  Arrays.asList(data,data2,data3);
        model.addAttribute("list", list);
        return "index";
    }
}
