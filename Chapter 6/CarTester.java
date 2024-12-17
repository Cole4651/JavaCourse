

public class CarTester {
    public static void main(String[] args) {
        Car ford = new Car(2005, "Focus");

        System.out.println("Accelerating ");
        for(int i = 0; i < 5; i++) {
            ford.accelerate();
            System.out.println("Speed: " + ford.getSpeed());
        }

        System.out.println();
        System.out.println("Braking ");
        for(int i = 0; i < 5; i++) {
            ford.brake();
            System.out.println("Speed: " + ford.getSpeed());
        }
    }
}
