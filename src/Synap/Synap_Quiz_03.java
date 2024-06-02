package Synap;

public class Synap_Quiz_03 {

    public static void main(String[] args) {

        long num = 600851475143L;
        long result = 2;

        for(long i = 2; i <= Math.sqrt(num); i++){
            if(i % 2 == 1){
                if(num % i == 0){
                    if (isPrime(i)){
                    result = i;
                    System.out.println(result);
                    }
                }
            }
        }
        System.out.println("end");
        System.out.println(result);
    }

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}