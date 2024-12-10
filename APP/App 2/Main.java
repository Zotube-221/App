public class Main {
    public static void main(String[] args) {
        IProduit produitService = new ProduitImpl();

        // Saisie d'un produit
        Produit produit = produitService.saisie();

        // Affichage des infos
        produitService.affichage(produit);
    }
}
