import java.util.Scanner;

public class MontreImpl implements IMontre {

    @Override
    public Montre saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'id de la montre : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne

        System.out.print("Entrez le libellé de la montre : ");
        String lib = scanner.nextLine();

        System.out.print("Entrez la nature de la montre : ");
        String nature = scanner.nextLine();

        return new Montre(id, lib, nature);
    }

    @Override
    public void affichage(Montre m) {
        System.out.println(m.toString());
    }
}
