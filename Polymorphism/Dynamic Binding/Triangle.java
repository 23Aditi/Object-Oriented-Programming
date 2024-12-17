
import java.util.Scanner;

class Triangle extends Shape{
    private float side1;
    private float side2;
    private float side3;
    private double Area;

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public Triangle(){
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
        this.Area=0;

    }

    public Triangle(float side1,float side2 , float side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.Area=0;

    }

    @Override
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side1 : ");
        setSide1(scanner.nextFloat());
        System.out.println("Enter the length of side2 : ");
        setSide2(scanner.nextFloat());
        System.out.println("Enter the length of side3 : ");
        setSide3(scanner.nextFloat());
    }

    @Override
    public float computeArea(){
        float s = (getSide1() + getSide2() + getSide3())/2;
        float num = s*(s-getSide1())*(s-getSide2())*(s-getSide3());
        setArea(Math.sqrt(num));
        return (float)getArea(); 
    }
}