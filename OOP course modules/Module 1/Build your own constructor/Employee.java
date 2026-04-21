public class Employee {
    private String name;
    private int potentialPoints;
    private double salary;

    public Employee(String name, int potentialPoints, double salary) {
        this.name = name;
        this.potentialPoints = potentialPoints;
        this.salary = salary;
    }
  
    public void applyPromotion() {
        double raiseAmount = this.salary * 0.15; // 15% raise
        this.salary += raiseAmount;
        System.out.println("PROMOTED! " + this.name + " gets the promotion. New salary: $" + this.salary + "\n");
    }
  
    public String getName() {
        return name;
    }

    public int getPotentialPoints() {
        return potentialPoints;
    }

    public double getSalary() {
        return salary;
    }
}
