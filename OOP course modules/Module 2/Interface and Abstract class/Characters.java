public class Dragon extends GameCharacter implements Flyable {

    public Dragon(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("🔥 " + this.name + " breathes devastating fire!");
    }

    @Override
    public void takeOff() {
        System.out.println("🦇 " + this.name + " leaps into the air and flaps its massive wings.");
    }

    @Override
    public void fly() {
        System.out.println("☁️ " + this.name + " is soaring through the sky.");
    }

    @Override
    public void land() {
        System.out.println("🪨 " + this.name + " crashes down to the ground with a thud.");
    }
}
