
import java.util.Scanner;

class Max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
             max = arr[i];
        } else if(arr[i]<min){
            min = arr[i];
        }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}