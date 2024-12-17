class Complex{
    private float real;
    private float img;

    public Complex(){
        real = 0;
        img = 0;
    }

    public Complex(float real , float img){
        this.real = real;
        this.img = img;
    }

    public static void display(Complex c){
        System.out.println(c.real + " + " + c.img + "i");
    }

    public Complex add(Complex c1 , Complex c2){
        return new Complex(c1.real + c2.real , c1.img + c2.img);
    }

    public Complex sub(Complex c1 , Complex c2){
        return new Complex(c1.real-c2.real , c1.img - c2.img);
    }

    public Complex mul(Complex c1 , Complex c2){
        return new Complex(c1.real*c2.real - c1.img*c1.img , c1.real*c2.img + c1.img*c2.real);
    }

    public Complex div(Complex c1 , Complex c2){
        float newReal = c1.real*c2.real + c1.img*c2.img;
        float div = c2.real*c2.real + c2.img*c2.img;
        float newImg = c1.img*c2.real - c1.real*c2.img;
        return new Complex(newReal/div,newImg/div);
    }
}

