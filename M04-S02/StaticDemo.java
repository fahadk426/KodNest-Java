class StaticDemo{
    static {
        System.out.println("1st Static Block");
    }
    static {
        System.out.println("2nd Static Block");
    }
    static {
        System.out.println("3rd Static Block");
    }
    {
        System.out.println("1st Non-Static Block");
    }
    
    {
        System.out.println("2nd Non-Static Block");
    }
    
    {
        System.out.println("3rd Non-Static Block");
    }
}