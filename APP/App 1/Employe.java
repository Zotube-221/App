import java.util.Scanner;
public class Employe extends Personne {
    private String fonction;
    private int salaire;
    Employe(){};
    Employe(String fonction, int salaire){
        this.fonction = fonction;
        this.salaire = salaire;
        }
    public String getFonction(){
        return fonction;
    }
    public int getSalaire(){
        return salaire;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    public void saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom : ");
        this.fonction = scanner.nextLine();
        System.out.print("Entrez le prénom : ");
        this.salaire = Integer.parseInt(scanner.nextLine());
        System.out.print("Entrez la fonction : ");
        this.fonction = scanner.nextLine();
        System.out.print("Entrez le salaire : ");
        this.salaire = scanner.nextInt();
    }
    public void affiche() {
        System.out.println("Nom : " + this.getLastName() + ", Prénom : " + this.getFirstName());
        System.out.println("Fonction : " + this.fonction + ", Salaire : " + this.salaire);
    }
}
