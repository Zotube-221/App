public class Montre extends Article {
    private String nature;

    // Constructeur
    public Montre(int id, String lib, String nature) {
        super(id, lib);
        this.nature = nature;
    }

    // Getters et Setters
    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    @Override
    public String toString() {
        return "Montre [nature=" + nature + ", " + super.toString() + "]";
    }
}
