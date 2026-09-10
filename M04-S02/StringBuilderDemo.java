class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());//16
        sb.append("Java");
        System.out.println(sb);
        System.out.println(sb.length());//0
        System.out.println(sb.capacity());//16

        sb.append(" is a programming language");
        System.out.println(sb.length());//30
        System.out.println(sb.capacity());//34
        /* formula for capacity is 
            old_capacity *2 + 2;
        */


    }
}