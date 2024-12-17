class Main{
    public static void main(String args[]){
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(1,2);
        
        System.out.print("Addition of c1 and c2 : ");
        Complex.display(c1.add(c1,c2));
        System.out.print("Subtraction of c1 and c2 : ");
        Complex.display(c1.sub(c1,c2));
        System.out.print("Multiplication of c1 and c2 : ");
        Complex.display(c1.mul(c1,c2));
        System.out.print("Division of c1 and c2 : ");
        Complex.display(c1.div(c1,c2));
    }
}