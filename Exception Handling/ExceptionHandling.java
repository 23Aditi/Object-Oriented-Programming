import java.util.*;
class ExceptionHandling{
    private int num1;
    private int num2;
    private int[] arr = new int[2];
    public ExceptionHandling() {
        this.num1=0;
        this.num2=0;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter first Number");
            num1 = scanner.nextInt();
            System.out.println("Enter second Number");
            num2 = scanner.nextInt();
            arr[0]=num1;
            arr[1]=num2;
        }catch(java.util.InputMismatchException e){
            System.out.println("Pls Enter Numbers only !");
        }catch(Exception e){
            System.out.println("Exception occured !");
        }
        finally{
            System.out.println("\t\t\tThank You !\t");
            scanner.close();
        }
    }

    public void input(String s1 , String s2){
        
        try{
            num2 = Integer.parseInt(s2);
            num1 = Integer.parseInt(s1);
            arr[0]=num1;
            arr[1]=num2;
        }catch(NumberFormatException e){
            System.out.println("Pls Enter Numbers only !");
        }catch(Exception e){
            System.out.println("Exception occured !");
        }
        finally{
            System.out.println("\t\t\tThank You !\t");
        }
    }

    public void div(){
        try {
            if(num2==0){
                throw new ArithmeticException("Division By zero is not allowed");
            }
            System.out.println("Result : " + (num1/num2));
            
        } catch (ArithmeticException e) {
            System.out.println("🛑Error : "+ e.getMessage());
        }
        catch(Exception e){
            System.out.println("An Unexpected Error Occured!");
        }
    }

    public void display(int n){
        try{
            if(n>2){
                throw new ArrayIndexOutOfBoundsException("Pls, pass a number less than or equal to 2");
            }
            for(int i=0 ; i < n ; i++){
                System.out.println("The "+ (i+1) + " Element is : " + arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

}