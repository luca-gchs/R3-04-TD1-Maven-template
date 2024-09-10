import java.util.Scanner; 

/**
 * Ceci est une classe qui vérifie que vous êtes un citoyen de la Super Terre
 * 
 * @author Nicolas Ho
 */
public class Democracy {
    public static void main(String[] args) {
        if (citizen_verification()) {
            System.out.println("Well done citizen, Super Earth is proud of you !");
        }
        else {
            System.out.println("Traitor detected, security in coming !!!!");
        }
    }

     /**
     * Fonction de vérification de la citoyenneté
     * 
     * @return true si s'est le cas sinon false
     */
    public static boolean citizen_verification() {
        boolean bool = false;
        try (Scanner keyboard = new Scanner(System.in)) {
            String answer = "";

            for (int i = 0; i<4; i++) {
                if (answer.equals("A") || answer.equals("a")) {
                    bool = true;
                    break;
                }

                System.out.println("Do you think Democracy is a good thing ? (A or B)");
                System.out.println("A) Yes");
                System.out.println("B) No");
                System.out.println("\nYour answer : ");
                answer = keyboard.nextLine();
                
            }   
            return bool;
        }
    }
}
