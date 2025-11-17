import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short MAX_SPEED = 250;
        short MIN_SPEED = 1;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        System.out.println("Нужно ввести 3 машины и их скорости.");
        for (int i = 0; i < 3; i++) {
            String name = "";
            while (name.isEmpty()) {
                System.out.println("Введите название машины " + (i + 1) + ":");
                name = scanner.next();
                if (name.isEmpty()) {
                    System.out.println("Название машины не должно быть пустым");
                }
            }
            int speed = -1;
            while (speed < MIN_SPEED || speed > MAX_SPEED) {
                System.out.println("Введите скорость машины " + (i + 1) + " в диапазоне 1-250:");
                speed = scanner.nextInt();
            }
            Car newCar = new Car(name, speed);
            cars.add(newCar);
        }
        Car fastestCar = Race.findWinner(cars);
        System.out.println("Самая быстрая машина: " + fastestCar.name);
    }
}