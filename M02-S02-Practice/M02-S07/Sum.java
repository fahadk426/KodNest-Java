
import java.util.Scanner;

class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter array elements");
        for(int i=0;i<=a.length-1;i++){
            a[i] = sc.nextInt();
        }
        int sum=0;
         System.out.print("Array Elements are: ");
        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i] +" ");
            sum += a[i];
        }
        System.out.println();
        System.out.println("Total: " +sum);
    }
}