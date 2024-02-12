package Methods;

public class isNumAPalindromeMethod {
    public static void main(String[] args) {

        int num1 = 121;
        int num2 = 12321;
        int num3 = 145215;

        System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + isPalindrome(num2));
        System.out.println(num3 + " is a palindrome: " + isPalindrome(num3));
    }

    public static boolean isPalindrome(int num) {
        String strNumber = Integer.toString(num);

        int left = 0;
        int right = strNumber.length() - 1;

        while (left < right) {
            if (strNumber.charAt(left) != strNumber.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}