public abstract class Vehicle {
    private int speed;
    private String brand;

    public Vehicle() {
        this.speed = 10;
        this.brand="Range Rover";
    }

    public abstract void speedUp();
    public abstract void brandName();


    public int getSpeed() {
        return speed;
    }
    public String getBrand() {
        return brand;
    }



    protected void setSpeed(int speed) {
        this.speed = speed;
    }
    protected void setBrand(String brand) {
        this.brand=brand;
    }
}