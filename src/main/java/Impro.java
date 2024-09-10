import java.util.Random;
import java.util.random.*;; 

/**
 * Ceci est une classe impro
 * @author LUCA GACHES
 * @author LG
 */

public class Impro {
    public static void main(String[] args) {
        int var1 = 2;
        System.out.println(fonction(var1));
        System.out.println("Guess the random int ? ");
        int tailleDe = 20;
        System.out.println(roleDice(tailleDe));
    }
    
    /**
     * Fonction de jet de dé aléatoire 
     * @param paramDe la taille du dé 
     * @return retourne l'entier choisi par le dé 
     */
    public static int roleDice(int paramDe) {
        Random random = new Random();

        int randomInt = random.nextInt(paramDe)+1;
        return randomInt;
    }

    /**
     * Fonction ne servant à pas grand chose qui additionne des integers 
     * @param param1 integer en entrée 
     * @return retourne un int random
     */
    public static int fonction(int param1) {
        param1 += param1; 
        Random random = new Random();

        int randomInt = random.nextInt(101); // entre 0 et 100
        param1 += randomInt;
        return param1; 
    }
}
