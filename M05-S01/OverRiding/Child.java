class Child extends Parent{
    @Override
    void disp2(){
        System.out.println("Inside Child disp2");//overridden method
    }

    void disp3(){
        System.out.println("Inside Child disp3");// child specialised methods
    }
}