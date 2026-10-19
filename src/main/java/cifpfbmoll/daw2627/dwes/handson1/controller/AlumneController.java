package cifpfbmoll.daw2627.dwes.handson1.controller;

import cifpfbmoll.daw2627.dwes.handson1.service.AlumneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/alumnes")
public class AlumneController {
    private final AlumneService service;

    public AlumneController(AlumneService service) {
        this.service = service;
    }

    @GetMapping
    public String llista(Model model, @RequestParam(required = false) String curs) {
        model.addAttribute("alumnes", curs == null ? service.findAll() : service.findByCurs(curs));
        return "alumnes/llista";
    }
}