class PrintChar extends Thread{
    @Override
    public void run(){
        System.out.println("Printing Char Thread Started");
        for(char c = 'A'; c <= 'G'; c++){
            System.out.println(c);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing Char Thread Completed");
    }
}