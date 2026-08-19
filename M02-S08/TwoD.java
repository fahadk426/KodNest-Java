
import java.util.Scanner;

class TwoD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][5];
        System.out.println("Enter array Elements");

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are:");
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
             System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}