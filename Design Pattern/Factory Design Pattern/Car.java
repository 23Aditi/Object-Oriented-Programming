abstract class Car {
    public abstract void allocateAccessories();  // Method to allocate accessories
    public abstract void assembleBody();        // Method to assemble the body
    public abstract void paintCar();            // Method to paint the car
    public abstract void finalMakeup();         // Final steps in making the car

    // Method that represents the full car-building process
    public final void buildCar() {
        allocateAccessories();
        assembleBody();
        paintCar();
        finalMakeup();
    }
}
