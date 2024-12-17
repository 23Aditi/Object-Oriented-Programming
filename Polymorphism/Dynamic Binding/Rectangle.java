
import java.util.Scanner;

class Rectangle extends Shape{
    private float side1;
    private float side2;
    private float Area;

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

    public float getArea() {
        return Area;
    }

    public void setArea(float Area) {
        this.Area = Area;
    }

    public Rectangle(){
        this.side1 = 0;
        this.side2 = 0;
        this.Area=0;
    }

    public Rectangle(float side1,float side2 ){
        this.side1 = side1;
        this.side2 = side2;
        this.Area=0;

    }

    @Override
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side1 : ");
        setSide1(scanner.nextFloat());
        System.out.println("Enter the length of side2 : ");
        setSide2(scanner.nextFloat());
        
    }

    @Override
    public float computeArea(){
        setArea(getSide1()*getSide2());
        return getArea(); 
    }
}