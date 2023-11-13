public class Car extends Vehicle {

    public void speedUp() {
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed + 10);
        System.out.println("Car: Speed increased by 10. Current speed: " + getSpeed());
    }
    public void brandName(){
        String currentBrand=getBrand();
        setBrand(currentBrand);
        System.out.println("Car: Brand : " + getBrand());
    }
}
