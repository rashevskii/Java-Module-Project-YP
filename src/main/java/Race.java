import java.util.ArrayList;

public class Race {
    public static Car findWinner(ArrayList<Car> cars) {
        int longest = 0;
        Car fastestCar = cars.get(0);
        for (Car car : cars) {
            int way = car.speed * 24;
            if (way > longest) {
                longest = way;
                fastestCar = car;
            }
        }
        return fastestCar;
    }
}
