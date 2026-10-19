package cifpfbmoll.daw2627.dwes.handson1.model;

import java.util.ArrayList;
import java.util.List;

public class Alumne {
    Long id;
    String nom, cognoms, curs;
    List<Nota> notes = new ArrayList<>();

    public Alumne(Long id, String nom, String cognoms, String curs) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.curs = curs;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public List<Nota> getNotes() {
        return notes;
    }

    public void setNotes(List<Nota> notes) {
        this.notes = notes;
    }
}
