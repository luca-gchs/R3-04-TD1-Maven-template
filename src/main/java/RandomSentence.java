import java.util.Random;

/**
 * Ceci est une classe qui print des petites phrases.
 * 
 * @author Hugo THOLLON
 */
public class RandomSentence {

    /**
     * Affiche une phrase préécrite parmis 10 phrases. Les nombres de 1 à 9 ont
     * une phrase unique et les autres nombres ont une même phrase.
     * 
     * @param number le nombre de la phrase à afficher. Il est préférable qu'il
     *               soit compris entre 1 et 9
     * 
     * @autor Hugo THOLLON
     */
    public void printSentence(int number) {
        String sentence = "Nombre : " + number + "\n";
        switch (number) {
            case 1:
                sentence += "Booooon, c'est pas ouf mais c'est mieux que rien";
                break;
            case 2:
                sentence += "Un binome, comme pour ce TP";
                break;
            case 3:
                sentence += "Jamais 2 sans 3";
                break;
            case 4:
                sentence += "QUATRE";
                break;
            case 5:
                sentence += "La moitié de 10";
                break;
            case 6:
                sentence += "Le nombre de cours qu'on a aujourd'hui";
                break;
            case 7:
                sentence += "Le nombre de jour dans la semaine";
                break;
            case 8:
                sentence += "Deux 'o' qui ont décidé de grandir";
                break;
            case 9:
                sentence += "Le nombre d'heure de cours qu'on a aujourd'hui";
                break;
            default:
                sentence += "Il y en a deja 9 et vous en voulez plus !!";
                break;
        }
        System.out.println(sentence);
    }

    /**
     * Affiche une des phrase de printSentence de façon aléatoire. N'affiche que
     * Les phrases comprises entre 1 et 9.
     * 
     * @see printSentence
     * @autor Hugo THOLLON
     */
    public void printRandomSentence() {
        Random rand = new Random();
        int randInt = rand.nextInt(1, 9);
        printSentence(randInt);
    }
}
