public class Main {
    public static void main(String[] args) {
        Dragon smaug = new Dragon("Smaug", 1000);

        smaug.takeDamage(50);

        smaug.attack();

        smaug.takeOff();
        smaug.fly();
        smaug.land();
    }
}
