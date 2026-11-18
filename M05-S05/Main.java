class Main{
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        accessMethod(c1);
        accessMethod(c2);
    }
    static void accessMethod(ParentAbstract ref){
        ref.disp1();
        ref.disp2();
    }
}