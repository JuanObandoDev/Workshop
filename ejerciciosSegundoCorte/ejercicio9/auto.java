package ejerciciosSegundoCorte.ejercicio9;

public class auto {
    // Attributes
    public String plate;
    public String brand;
    public String model;
    public String color;
    public int prize;
    public int doors;
    public int mileage;
    public boolean automatic;
    public boolean electric;
    public boolean used;

    // Constructor
    public auto(String plate, String brand, String model, String color, int prize, int doors, int mileage,
            boolean automatic, boolean electric, boolean used) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.prize = prize;
        this.doors = doors;
        this.mileage = mileage;
        this.automatic = automatic;
        this.electric = electric;
        this.used = used;
    }

    // Getters and Setters
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    // Methods
    public String turnOn() {
        return "The " + this.brand + " is on";
    }

    public String turnOff() {
        return "The " + this.brand + " is off";
    }

    public String startUp() {
        return "The " + this.brand + " is starting up";
    }

    public String stop() {
        return "The " + this.brand + " is stopped";
    }

    public String accelerate() {
        return "The " + this.brand + " is accelerating";
    }

    public String brake() {
        return "The " + this.brand + " is braking";
    }

    public String turnLeft() {
        return "The " + this.brand + " is turning left";
    }

    public String turnRight() {
        return "The " + this.brand + " is turning right";
    }

    public String changeGear() {
        return "The " + this.brand + " is changing gear";
    }

    @Override
    public String toString() {
        return "auto [automatic: " + this.automatic + ", brand: " + this.brand + ", color: " + this.color + ", doors: "
                + this.doors + ", electric: " + this.electric + ", model: " + this.model + ", mileage: " + this.mileage
                + "km, prize: $" + this.prize + ", used: " + this.used + "]";
    }
}
