package cifpfbmoll.daw2627.dwes.handson1.model;

public class Nota {
    String modul;
    Integer qualificacio;

    public Nota() {
    }

    public Nota(String modul, Integer qualificacio) {
        this.modul = modul;
    }

    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    public Integer getQualificacio() {
        return qualificacio;
    }

    public void setQualificacio(Integer qualificacio) {
        this.qualificacio = qualificacio;
    }
}
