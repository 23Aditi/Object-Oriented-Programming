class Hatchback extends Car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating basic accessories for Hatchback.");
    }

    @Override
    public void assembleBody() {
        System.out.println("Assembling small body for Hatchback.");
    }

    @Override
    public void paintCar() {
        System.out.println("Painting the Hatchback with a compact color.");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Finalizing the Hatchback with finishing touches.");
    }
}
