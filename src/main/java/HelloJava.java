/**
 * Ceci est une classe de test qui ne fait pas grand chose
 * 
 * @author JMB
 * @author LC
 */
class HelloJava {
	public static void main(String[] args) {
		System.out.println("Guten tag Blagnac");

		RandomSentence randomSentence = new RandomSentence();
		System.out.println("---------------------\nGet a random sentence");
		randomSentence.printRandomSentence();
		System.out.println("--------------\nGet sentence 3");
		randomSentence.printSentence(3);
	}

	public void afficherCancan() {

	}
}
