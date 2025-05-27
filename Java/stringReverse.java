import java.util.Scanner;
class stringReverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str=sc.nextLine();
        String revstr="";
        for(int i=0;i<str.length();i++){
            revstr=str.charAt(i)+revstr;
        }
        System.out.println("Original String : "+str);
        System.out.println("Reversed String : "+revstr);
        //System.out.println("Using StringBuilder ");
        StringBuilder sb=new StringBuilder(str).reverse();
        System.out.println("Reversed String using StringBuilder : "+sb.toString());
        sc.close();
    }
}
