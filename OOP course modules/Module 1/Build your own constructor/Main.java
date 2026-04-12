public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 92, 60000.0);
        Employee emp2 = new Employee("Bob", 85, 65000.0);

        evaluateAndPromote(emp1, emp2);
    }

    public static void evaluateAndPromote(Employee e1, Employee e2) {
        System.out.println("Comparing potential between " + e1.getName() + " (" + e1.getPotentialPoints() + " pts) and " + 
                           e2.getName() + " (" + e2.getPotentialPoints() + " pts)...");
        
        if (e1.getPotentialPoints() > e2.getPotentialPoints()) {
            e1.applyPromotion();
        } else if (e2.getPotentialPoints() > e1.getPotentialPoints()) {
            e2.applyPromotion();
        } else {
            System.out.println("Both employees have exactly the same potential points.");
        }
    }
}
