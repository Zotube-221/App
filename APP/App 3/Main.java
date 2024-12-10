public class Main {
    public static void main(String[] args) {
        IChemise chemiseService = new ChemiseImpl();
        Chemise chemise = chemiseService.saisie();
        chemiseService.affichage(chemise);

        IMontre montreService = new MontreImpl();
        Montre montre = montreService.saisie();
        montreService.affichage(montre);
    }
}
