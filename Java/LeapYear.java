import java.util.Scanner;
class LeapYear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year : ");
        int n=sc.nextInt();
        if ((n%4==0 && n%100!=0)||(n%400==0)){
            System.out.println(n+" is a leap year");
        }else{
            System.out.println(n+" is not a leap year");
        }
    }    
}
