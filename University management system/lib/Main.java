import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<UniversityMember> members = new ArrayList<>();

        members.add(new Professor(
                101,
                "Dr. Rahman",
                90000,
                "ICT",
                "Artificial Intelligence",
                25));

        members.add(new AdministrativeOfficer(
                201,
                "Mr. Karim",
                45000,
                "Registrar"));

        for (UniversityMember member : members) {
            member.displayBasicInfo();
            member.performDuty();
            System.out.println();
        }

        System.out.println("Professor Research Information:");

        for (UniversityMember member : members) {
            if (member instanceof Professor p) {
                p.showResearchProfile();
            }
        }
    }
}
