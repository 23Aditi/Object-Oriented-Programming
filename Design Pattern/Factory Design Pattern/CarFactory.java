class CarFactory {
    // Factory method to create cars based on type
    public static Car getCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("HATCHBACK")) {
            return new Hatchback();
        } else if (carType.equalsIgnoreCase("SEDAN")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("SUV")) {
            return new SUV();
        }
        return null;
    }
}
