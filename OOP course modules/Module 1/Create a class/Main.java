public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
      
        student1.setName("David");
        student1.setMarks(85.5, 92.0, 78.0); 

        student1.evaluateGrade();
        
        Student student2 = new Student();
        student2.setName("Sarah");
        student2.setMarks(95.0, 98.0, 91.0);
        student2.evaluateGrade();
    }
}
