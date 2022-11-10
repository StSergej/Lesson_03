package transport;

public class Car extends Vehicle{

    public Car() {
        super();
        this.coordLatitude = 100.35;
        this.coordLongitude = 65.12;
        this.speed = 180;
        this.price = 10200;
        this.year = 2018;
    }

    @Override
    public String toString() {
        return "Координаты долготы: " + coordLatitude + "; " + "Координаты широты: " + coordLongitude + "; " +
                "Скорость: " + speed + "; " + "Цена: " + price + "; " +
                "Год выпуска: " + year;
    }
}
