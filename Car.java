public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.err.println(getClass().getSimpleName());
        System.err.println("The engine has been started, and is ready to utilize " + horsePower
                + "horsepowers.n");
    }

    public void clean() {
        System.err.println("Car has been cleaned, and the " + color.toLowerCase() + " color shines");
    }

    public void mechanicCheck() {
        System.err.println("Car has been checked by mechanic. Everything looks good!");
    }

    public void fuelCar() {
        System.err.println("Car is being filled with " + fuelSource.toLowerCase());
    }
}
