package transport;

public class Vehicle {
    //координаты и параметры средств передвижения (цена, скорость, год выпуска);
    double coordLatitude;
    double coordLongitude;
    double speed;
    int price;
    int year;


    public Vehicle(double coordLatitude, double coordLongitude, double speed, int price, int year) {
        this.coordLatitude = coordLatitude;
        this.coordLongitude = coordLongitude;
        this.speed = speed;
        this.price = price;
        this.year = year;
    }

    public Vehicle() {

    }
}
