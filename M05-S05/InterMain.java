class InterMain {
    public static void main(String[] args) {
        Square s = new Square();
        s.input();
        s.disp();

        ShapeInterface ref;
        ref = s;
        ref.disp();
    }
}