import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please write something: ");
        String phrase = input.nextLine();

        Phrases phraseInstance = new Phrases(phrase);

        System.out.println("Phrase inverted: "+phraseInstance.getInvertedPhrase());
        System.out.println("Vocals found: "+phraseInstance.countVocalsPhrase());
        System.out.printf("Includes vocals? "+phraseInstance.containsVocalsPhrase());

        input.close();
    }
}