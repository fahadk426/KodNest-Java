class Stu{
    String name;
    int age;
    double height;

    void input (String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class Student{
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.input("Raja",18,5.5);
        s1.display();
    }
}