package transport;

public class Plane extends Vehicle {

    private double coordHeight;
    private int passengers;

    public Plane(double coordHeight, int passengers) {
        super();
        this.coordLatitude = 36.45;
        this.coordLongitude = 87.56;
        this.coordHeight = coordHeight;
        this.speed = 645.7;
        this.price = 75400300;
        this.year = 2015;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return ("Координаты долготы: " + coordLatitude + "; " + "Координаты широты: " + coordLongitude + "; " +
                "Координаты высоты: " + coordHeight + "; " + "\n" + "Скорость: " + speed + "; " +
                "Цена: " + price + "; " + "Год выпуска: " + year + "; " + "Количество пассажиров: " + passengers);
    }
}
