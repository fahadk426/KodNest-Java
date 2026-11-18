class Main{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display1();
        p.display2();
        ((Child1)(p)).display3();//Downcasting
        
    }
}