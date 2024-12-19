class Sedan extends Car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating luxury accessories for Sedan.");
    }

    @Override
    public void assembleBody() {
        System.out.println("Assembling large body for Sedan.");
    }

    @Override
    public void paintCar() {
        System.out.println("Painting the Sedan with a premium color.");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Finalizing the Sedan with luxury finishing.");
    }
}
