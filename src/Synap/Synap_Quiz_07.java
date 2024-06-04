package Synap;

import java.util.ArrayList;
import java.util.List;

public class Synap_Quiz_07 {

    public static void main(String[] args) {
        int idx = 1;
        List<Integer> primeList = new ArrayList();
        primeList.add(2);

        for (int i = 3; idx < 10001; i += 2) {
            boolean isPrime = true;
            for (int j : primeList){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeList.add(i);
                idx++;
            }
            System.out.println("idx : " + idx);
            System.out.println("i : "+ i);
        }

    }
}