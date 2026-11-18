import java.util.Scanner;

class Rethrowing{
    public static void main(String[] args) {
        System.out.println("Main method Execution Started");
        try{
            divide();
        }
        catch (Exception e){
            System.out.println("Exception handled in main menthod");
        }
        System.out.println("Main method Execution Completed");
    }
    static void divide(){
        try {
            System.out.println("Division started");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();
            int  res = a/b;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in divide menthod");
            throw e;
        }
        finally{
            System.out.println("Division completed");
        }
    }
}