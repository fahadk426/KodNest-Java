class Add{
    int add(int a,int b){
        int c = a+b;
        System.out.println(c);
        return c;
    }

    double add(int a,double b){
        return a+b;
    }
    double add(double a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(int a,int b,double c){
        return a+b+c;
    }
    double add(double a,double b,int c){
        return a+b+c;
    }       
}

class AdditionOverload{
    public static void main(String[] args) {
        Add a1=new Add();
        a1.add(10,20,2.5);
        a1.add(10, 20);
        a1.add(3.2,5.0);
        a1.add(2.5,9);
        a1.add(9,7.2);
        a1.add(1,2,3);
        a1.add(2.5,2.3,4);
    }
}
