package Synap;

public class Synap_Quiz_02 {

    public static void main(String[] args) {
        int result= 0;

        for(int i=1;fibonacci(i)<=4000000;i++){
            System.out.print(fibonacci(i)+" ");
            if(fibonacci(i)%2==0){
                result+=fibonacci(i);
            }
        }

        System.out.println("\n"+result);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}