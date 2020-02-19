import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GonzoController {

    @GetMapping ("/")
    public String get(){
        return "index";
    }
}
