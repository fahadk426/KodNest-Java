class Main{
    public static void main(String[] args) {
        // in this .equals mainly used to compare address of objects 
        StudentObj s1 = new StudentObj(11,"Raja");
        StudentObj s2 = new StudentObj(11,"Rani");
        StudentObj s3 = new StudentObj(11,"Raja");

        System.out.println(s1.equals(s3)); //returns false
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s1.toString();
        System.out.println(s1);
    }
}