package transport;

public class Ship extends Vehicle {

    private int passengers;
    private String port;

    public Ship(int passengers, String port){
        super();
        this.coordLatitude = 37.72;
        this.coordLongitude = 120.45;
        this.speed = 45;
        this.price = 600450700;
        this.year = 2012;
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Координаты долготы: " + coordLatitude + "; " + "Координаты широты: " + coordLongitude + "; " +
                "Скорость: " + speed + "; " + "Цена: " + price + "; " + "\n" + "Год выпуска: " + year + "; " +
                "Количество пассажиров: " + passengers + "; " + "Порт приписки: " + port;
    }
}
