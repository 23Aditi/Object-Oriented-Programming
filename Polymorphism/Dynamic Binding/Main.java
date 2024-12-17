class Main{
    public static void main(String[] args) {
        Shape s = new Triangle();
        s.input();
        System.out.println("Area of Triangle is : "+ s.computeArea());

        Shape s1 = new Rectangle();
        s1.input();
        System.out.println("Area of Rectangle is : "+ s1.computeArea());
    }
}