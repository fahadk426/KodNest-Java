import java.util.Scanner;
class Exception{
    public static void main(String[] args) {
        System.out.println("Connection established");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int res = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Connection closed");
    }
}