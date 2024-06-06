package Synap;

public class Synap_Quiz_14 {

    public static void main(String[] args) {
        int max = 0;
        int maxNum = 0;
        for (int i = 1; i <= 1000000; i++) {
            int cnt = 0;
            long num = i;
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num= 3*num+1;
                }
                cnt++;
            }
            if (cnt > max) {
                max = cnt;
                maxNum = i;
                System.out.println(maxNum);
            }
//            if(i%100000 == 0){
//                System.out.println("작업중");
//            }
            System.out.println(i);
        }
        System.out.println(maxNum);
        System.out.println(max);
    }
}