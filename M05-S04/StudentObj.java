import java.util.Objects;
public class StudentObj{
    int roll;
    String name;

    @Override
    public boolean equals(Object obj){
        StudentObj s = (StudentObj)obj;
        if(this.roll == s.roll && this.name.equals(s.name)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(roll,name);
    }

    @Override
    public String toString(){
        return roll + " " + name;
    }

    StudentObj(int roll,String name) {
        this.roll = roll;
        this.name = name;
    }
    void display(){
        System.out.println(roll);
        System.out.println(name);
    }
}