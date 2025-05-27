import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
class customException{
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age less than 18 not eligible. InvalidAGE !!!");
        }else{
            System.out.println("You are eligible");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        try{
            checkAge(age);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
