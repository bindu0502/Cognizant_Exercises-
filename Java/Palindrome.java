import java.util.Scanner;
class Plaindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input=sc.nextLine();
        String str = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println("Original String : "+str);
        System.out.println("Reversed String : "+rev);
        if(str.equals(rev)){
            System.out.println("Give string "+ str +" is a palindrome");
        }else{
            System.out.println("Give string "+ str +" is not a palindrome");
        }
    }
}