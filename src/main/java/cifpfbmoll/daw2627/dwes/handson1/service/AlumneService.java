package cifpfbmoll.daw2627.dwes.handson1.service;

import cifpfbmoll.daw2627.dwes.handson1.model.*;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class AlumneService {
    private final List<Alumne> alumnes = new ArrayList<>(List.of(
            new Alumne(1L, "Aina", "Ferrer", "DAW2"),
            new Alumne(2L, "Pau", "Riera", "DAW2"),
            new Alumne(3L, "Laia", "Sastre", "DAW1"),
            new Alumne(4L, "Marc", "Vidal", "DAW1")));

    public List<Alumne> findAll() {
        return alumnes;
    }

    public Optional<Alumne> findById(Long id) {
        return alumnes.stream().filter(a -> a.getId().equals(id)).findFirst();
    }

    public List<Alumne> findByCurs(String curs) {
        return alumnes.stream().filter(a -> a.getCurs().equalsIgnoreCase(curs)).toList();
    }

    public void afegirNota(Long id, Nota nota) {
        findById(id).ifPresent(a -> a.getNotes().add(nota));
    }
}