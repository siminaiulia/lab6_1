public class Bicycle extends Vehicle {

    public void speedUp() {
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed + 5);
        System.out.println("Bicycle: Speed increased by 5. Current speed: " + getSpeed());
    }
    public void brandName(){
        String currentBrand=getBrand();
        setBrand(currentBrand);
        System.out.println("Bicycle: Brand : " + getBrand());
    }
}