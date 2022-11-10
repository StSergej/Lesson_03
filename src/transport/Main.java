package transport;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Plane plane = new Plane(6800, 180);
        Ship ship = new Ship(4880, "Marsel");

        System.out.println("Автомобиль: " + "\n" + car.toString());
        System.out.println("Самолет: " + "\n" + plane.toString());
        System.out.println("Лайнер: " + "\n" + ship.toString());
    }
}
