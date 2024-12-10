//import java.util.Scanner;
public class Personne {
        private String lastName;
        private String firstName;
        Personne(){};
        Personne(String lastName, String firstName){}
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void saisie(){
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Your first name : ");
            this.firstName= sc.nextLine();
            System.out.println("Your last name : ");
            this.lastName= sc.nextLine();
        }
        public void afficher(){
            System.out.println(firstName+" "+lastName+" "+" on vous souhaite la bienvenue dans notre plateforme");
        }
}