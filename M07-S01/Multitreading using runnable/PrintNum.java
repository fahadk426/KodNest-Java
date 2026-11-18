public class PrintNum implements Runnable{
    @Override
    public void run(){
        System.out.println("Printing Num Thread Started");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing Num Thread Completed");
    }
}