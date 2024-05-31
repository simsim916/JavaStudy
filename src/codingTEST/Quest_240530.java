package codingTEST;

import java.util.ArrayList;
import java.util.List;

public class Quest_240530 {

    // 팬린드롬인지 확인하는 메서드 -> checkPalin

    public static String[] solution(String[] P) {
        List list = new ArrayList();

        for (int i = 0; i < P.length; i++) {

        }
        String[] result = null;

        return result;
    }

    public static boolean checkPalin(String A, String B) {
        String AB = A + B;
        int ABLength = AB.length();

        for (int i = 0; i < AB.length(); i++) {
            if (AB.charAt(i) != AB.charAt(AB.length() - 1 - i)) {
                if (ABLength / 2 > i) {
                    if (AB.charAt(i) != AB.charAt(ABLength - i))
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String[] input = {"11","111","11","211"};
        System.out.println(solution(input));
    }

}
