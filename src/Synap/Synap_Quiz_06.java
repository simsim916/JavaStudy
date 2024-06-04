package Synap;

public class Synap_Quiz_06 {

    public static void main(String[] args) {
        int num = 100;
        int resultM = 0;
        for (int i = 1; i <= num; i++) {
            resultM += i*i;
        }

        int resultS = 0;

        for (int i = 1; i <= num; i++) {
            resultS += i;
        }

        System.out.println("ResultM: " + resultM);
        System.out.println("ResultS: " + resultS*resultS);
        System.out.println(resultS*resultS - resultM);
    }
}