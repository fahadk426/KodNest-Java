class Stud{
    String name;
    int age;
    double height;

    Stud(String name,int age,double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
public class StudentConstruct{
    public static void main(String[] args) {
        Stud s1 = new Stud("raja",18,5.5);
        s1.display();
    }
}