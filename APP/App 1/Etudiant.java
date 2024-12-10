import java.util.Scanner;
 public class Etudiant extends Personne{
    // declaration de mes variables
    private String matricule;
    private double moyenne;

    // mon constructeur vide avec la declaration avec un champ vide

        Etudiant(){
        super();
        this.matricule="";
        this.moyenne=0.0;
    }
        Etudiant(String firstName, String lastName, double moyenne){
            super(firstName, lastName);
            this.moyenne=moyenne;
            this.matricule= generateMatricule();
        }
        // getteur et setteur de matricule

            public String getMatricule(){
            return matricule;
            }
            public void setMatricule(String matricule){
            this.matricule=matricule;
            }
        // getteur et setteur de moyenne

            public double getMoyenne(){
            return moyenne;
            }

            public void setMoyenne(double moyenne) {
            this.moyenne=moyenne;
        }
            //generer une matricule
            public String generateMatricule () {
                return "ET" + System.currentTimeMillis();
        }
     @Override
     public void saisie() {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Entrez le nom : ");
         this.matricule = scanner.nextLine();

         System.out.print("Entrez le prénom : ");
         this.moyenne = Double.parseDouble(scanner.nextLine());

         boolean saisieValide = false;
         while (!saisieValide) {
             System.out.print("Entrez la moyenne (nombre décimal) : ");
             String input = scanner.nextLine();}
     }
            public void affiche() {
            super.afficher(); // Appelle la méthode affiche() de Personne pour afficher nom et prenom
            System.out.println("Matricule : " + matricule + ", Moyenne : " + moyenne);
        }


      }