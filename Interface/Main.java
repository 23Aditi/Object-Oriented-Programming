
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle v;
        System.out.println("Enter 1 : For Car \t 2 : Bicycle \t 3 : Bike");
        int op = scanner.nextInt();
        switch(op){
            case 1 :
                v = new Car();
                break;
            case 2 :
                v = new Bicycle();
                break;
            case 3:
                v = new Bike();
                break;
            default: v = new Car();break;
        }
        v.gearChange();
        v.speedUp();
        v.applyBreak();

        scanner.close();
    }
}