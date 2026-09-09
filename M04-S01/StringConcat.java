class StringConcat{
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Programming";
        String s3 = s1 + s2;
        System.out.println(s3);
        String t1 = new String("ABC");
        String t2 = new String("XYZ");
        String res = t1.concat(t2); 
        System.out.println(res);
    }
}