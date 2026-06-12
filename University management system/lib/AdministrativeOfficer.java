public class AdministrativeOfficer extends Employee {
    private final String office;

    public AdministrativeOfficer(int memberId, String name, double salary, String office) {
        super(memberId, name, salary);
        this.office = office;
    }

    public void showOffice() {
        System.out.println("Office: " + office);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " manages administrative tasks.");
    }
}
