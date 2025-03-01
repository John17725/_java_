public class Phrases {
    private String phrase;

    public Phrases(String phrase) {
        this.phrase = phrase;
    }


    public String getInvertedPhrase() {
        return new StringBuilder(phrase).reverse().toString();
    }

    public int countVocalsPhrase() {
        int countVocals = 0;
        for (char letter: phrase.toLowerCase().toCharArray()){
            if("aeiou".indexOf(letter)!= -1){
                countVocals++;
            }
        }
        return countVocals;
    }

    public Boolean containsVocalsPhrase() {
        return  phrase.toLowerCase().matches(".*[aeiou].*");
    }


}
