public abstract class GameCharacter {
    protected String name;
    protected int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damageAmount) {
        this.health -= damageAmount;
        System.out.println(this.name + " took " + damageAmount + " damage! Health is now " + this.health);
    }

    public abstract void attack();
}
