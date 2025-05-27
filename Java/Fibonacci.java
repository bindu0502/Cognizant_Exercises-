import java.util.Scanner;
class Fibonacci {
    public static int fib(int n){
        if(n<=1){
            return n;
        }else{
           return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Fibomacci is not applicable for negative numbers");
        }else{
            for (int i = 0; i <= n; i++) {
                System.out.print(fib(i) + " ");
            }
            //System.out.println("Fibonacci number at position "+n+" is :"+fib(n));
        }
        sc.close();
    }
    
}
