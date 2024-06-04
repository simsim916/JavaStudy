package Synap;

import java.util.ArrayList;
import java.util.List;

public class Synap_Quiz_10 {

    public static void main(String[] args) {
        int idx = 1;
        List<Integer> primeList = new ArrayList();
        primeList.add(2);

        int sum = 0;
        for (int i = 3; i < 2000000; i += 2) {
            boolean isPrime = true;
            for (int j : primeList){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
                sum += i;
                primeList.add(i);
                idx++;
            }
        }
        System.out.println(sum);

    }
}