package cifpfbmoll.daw2627.dwes.handson1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {
    @GetMapping("/")
    public String inici(Model model) {
        model.addAttribute("missatge", "Hola, DAW2!");
        return "index";
    }
}