package Methods;

public class middleCharOfAStringMethod {
    public static void main(String[] args) {

        String word1 = "pretty";
        String word2 = "amazing";

        System.out.println("Middle character(s) of " + word1 + " : " + middleCharOfAString(word1));
        System.out.println("Middle character(s) of " + word2 + " : " + middleCharOfAString(word2));
    }
    public static String middleCharOfAString(String word) {
        int length = word.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            return word.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return word.substring(middleIndex, middleIndex + 1);
        }
    }
}