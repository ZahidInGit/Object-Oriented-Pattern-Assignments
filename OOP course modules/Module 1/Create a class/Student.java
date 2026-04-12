public class Student {
    private String name;
    private double mathMark;
    private double scienceMark;
    private double englishMark;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double math, double science, double english) {
        this.mathMark = math;
        this.scienceMark = science;
        this.englishMark = english;
    }
    public void evaluateGrade() {
        double average = (mathMark + scienceMark + englishMark) / 3.0;
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.printf("%s's Average is %.1f. Final Grade: %s\n", this.name, average, grade);
    }
}
