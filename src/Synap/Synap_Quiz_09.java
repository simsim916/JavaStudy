package Synap;

public class Synap_Quiz_09 {

    public static void main(String[] args) {

        for (int a = 1 ; a <= 332 ; a++){
            for (int b = a+1 ;  b < 1000 - a - b ; b++){
                if( a*a + b*b == (1000 - a - b) * (1000 - a - b)){
                    System.out.printf("a : %d / b : %d / c : %d \n", a, b, 1000 -a-b);
                    System.out.println(a*b*(1000 - a - b));
                }
            }
        }

    }
}