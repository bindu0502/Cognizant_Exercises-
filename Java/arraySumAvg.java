import java.util.Scanner;
class arraySumAvg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        System.out.println("Enter the array elements");
        int[] arr=new int[size];
        int i;
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements are : ");
        for(i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        float sum=0;
        for(i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array elements is : "+sum);
        float avg=sum/size;
        System.out.println("Average of array elements is : "+avg);
    }
    
}
