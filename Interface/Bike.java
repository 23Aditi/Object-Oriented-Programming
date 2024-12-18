class Bike implements Vehicle{
    String vehicle = "Bike";

    @Override
    public void gearChange(){
        System.out.println("Changing gear of "+vehicle);
    }

    @Override
    public void speedUp(){
        System.out.println("increasing speed of "+vehicle);
    }

    @Override
    public void applyBreak(){
        System.out.println("decreasing speed of "+vehicle);
    }
}