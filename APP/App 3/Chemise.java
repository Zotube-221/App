public class Chemise extends Article {
    private String couture;

    // Constructeur
    public Chemise(int id, String lib, String couture) {
        super(id, lib);
        this.couture = couture;
    }

    // Getters et Setters
    public String getCouture() {
        return couture;
    }

    public void setCouture(String couture) {
        this.couture = couture;
    }

    @Override
    public String toString() {
        return "Chemise [couture=" + couture + ", " + super.toString() + "]";
    }
}

