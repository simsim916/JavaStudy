package Synap;

public class Synap_Quiz_12 {

    public static void main(String[] args) {
        int num = 0;
        outerLoop:
        for (int i = 1; true; i++) {
            num += i;
            int cnt = 0;
            System.out.println();
            System.out.print(num + " : ");
            for (int j = 1; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    System.out.print(j+", ");
                    cnt++;
                    if (cnt >= 250) {
                        break outerLoop;
                    }
                }
            }
        }

        System.out.println(num);

    }
}