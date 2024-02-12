package Methods;

public class countAllWordInStringMethod {
    public static void main(String[] args) {

        String sentence1 = "Everything will be so good so soon";
        String sentence2 = "Hang in there";

        System.out.println("Number of words in  " + sentence1 + ": " + countWords(sentence1));
        System.out.println("Number of words in " + sentence2 + ": " + countWords(sentence2));
    }

    public static int countWords(String str) {
        String[]words = str.split("\\s+");
        return words.length;
    }
}