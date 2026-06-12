public class Professor extends AcademicStaff {
    private final String researchArea;
    private final int publications;

    public Professor(int memberId, String name, double salary, String department, String researchArea, int publications) {
        super(memberId, name, salary, department);
        this.researchArea = researchArea;
        this.publications = publications;
    }

    public void showResearchProfile() {
        System.out.println("Research Area: " + researchArea);
        System.out.println("Publications: " + publications);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " conducts research and teaches.");
    }
}
