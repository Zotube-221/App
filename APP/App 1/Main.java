import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Gestion de Personnes ===");

        // Choix du type
        System.out.println("Quel type de personne voulez-vous créer ?");
        System.out.println("1. Employé");
        System.out.println("2. Étudiant");
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        if (choix == 1) {
            // Création d'un Employé
            Employe employe = new Employe();
            System.out.println("\n=== Saisie des informations pour l'Employé ===");
            employe.saisie();
            System.out.println("\n=== Informations de l'Employé ===");
            employe.affiche();

        } else if (choix == 2) {
            // Création d'un Étudiant
            Etudiant etudiant = new Etudiant();
            System.out.println("\n=== Saisie des informations pour l'Étudiant ===");
            etudiant.saisie();
            System.out.println("\n=== Informations de l'Étudiant ===");
            etudiant.affiche();

        } else {
            System.out.println("Choix invalide. Fin du programme.");
        }

        scanner.close();
    }
     }