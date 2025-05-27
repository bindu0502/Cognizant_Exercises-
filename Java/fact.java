import java.util.Scanner;
class fact {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number only: ");
        int n=sc.nextInt();
        long factorial=1;
        if(n<0){
            System.out.println("No factorial for nrgative numbers");
        }else if(n==0){
            System.out.println("Factorial of "+n+" is 1");
        }else{
            for(int i=1;i<=n;i++){
                factorial*=i;
            }
            System.out.println("Factorial of "+n+" is "+factorial);
        }

    }
}
