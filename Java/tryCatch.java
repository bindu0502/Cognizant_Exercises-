import java.util.Scanner;
class tryCatch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numerator : ");
        int a=sc.nextInt();
        System.out.print("Enter the denominator : ");
        int b=sc.nextInt();
        try{
            int res=a/b;
            System.out.println("Result: " + res);
        }catch (ArithmeticException ae){
            System.out.println("Division by zero not possible");
        }

    }
}

