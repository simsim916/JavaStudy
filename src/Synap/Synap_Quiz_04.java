package Synap;

public class Synap_Quiz_04 {

    public static void main(String[] args) {
        long result = 1;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                long num = i * j;
                if (checkPalindrome(String.valueOf(num))) {
                    if(num>result)
                    result = num;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean checkPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}