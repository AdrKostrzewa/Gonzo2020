package pl.adrian.gonzo2020;

import models.Data;
import models.Relation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

@Controller
public class GonzoController {
        List <Data> list;
    public GonzoController() {
//        Data data = new Data("Adrian", "Kostrzewa", 18);
//        Data data2 = new Data("Marcin", "Rasiak", 24);
//        Data data3 = new Data("Zenon", "Lemon", 30);
        list = new ArrayList<>();
//        list.add(data);
//        list.add(data2);
//        list.add(data3);
    }


    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("list", list);
        model.addAttribute("newData", new Data ());
        return "index";
    }

    //ModelAttribiute aby z widoku można było dodawać do controllera
    @PostMapping("/add")
    public String  add(@ModelAttribute Data data){
        list.add(data);
        Collections.sort(list, Comparator.comparingInt(Data::getAge));

        System.out.println(data);

        return "redirect:/";
        //zamiast do widoku przenosi do metody "/"


    }
}
