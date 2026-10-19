package cifpfbmoll.daw2627.dwes.handson1.controller;

import cifpfbmoll.daw2627.dwes.handson1.model.Alumne;
import cifpfbmoll.daw2627.dwes.handson1.service.AlumneService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping("/{id}")
    public String fitxa(@PathVariable Long id, Model model) {
        Alumne a = service.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("alumne", a);
        model.addAttribute("mitjana", service.mitjana(a));
        return "alumnes/fitxa";
    }
}