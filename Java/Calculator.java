import java.util.Scanner;
class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a=sc.nextDouble();
        System.out.print("Enter second number : ");
        double b=sc.nextDouble();
        System.out.print("Enter the operator(+,-,*,/) : ");
        char op=sc.next().charAt(0);
        double res;
        switch(op){
            case '+':res=a+b;
                    System.out.println("Addition : "+res);
                    break;
            case '-':res=a-b;
                    System.out.println("Subtraction : "+res);
                    break;
            case '*':res=a*b;
                    System.out.println("Multiplication : "+res);
                    break;
            case '/':if(b!=0){
                        res=a/b;
                        System.out.println("Division : "+res);
                    }else{
                        System.out.println("Division not possible!");
                    }
                    break;
            default:System.out.println("Invalid Operator!!");
        }
        sc.close();
    }

}