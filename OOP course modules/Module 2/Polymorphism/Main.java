public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        Vehicle myBike = new Bike("Giant");

        myCar.start();
        myBike.start();
    }
}
