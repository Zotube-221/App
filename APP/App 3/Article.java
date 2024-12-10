public abstract class Article {
    protected int id;
    protected String lib;

    // Constructeur
    public Article(int id, String lib) {
        this.id = id;
        this.lib = lib;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", lib=" + lib + "]";
    }
}
