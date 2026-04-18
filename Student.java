import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private String department;
    private int semester;
    private int[] marks;
    private int total;
    private double average;
    private String grade;
    private String result;

    public Student(int rollNo, String name, String department, int semester, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.semester = semester;
        this.marks = marks;
    }

    public void calculate(ResultProcessor processor) {
        this.total = processor.calculateTotal(marks);
        this.average = processor.calculateAverage(total, marks.length);
        this.grade = GradeCalculator.getGrade(average);
        this.result = processor.getResultStatus(marks);
    }

    public void displayMarksheet() {
        System.out.println("\n================ MARKSHEET ================");
        System.out.println("Roll No     : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Semester    : " + semester);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("------------------------------------------");
        System.out.println("Total       : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Grade       : " + grade);
        System.out.println("Result      : " + result);
        System.out.println("==========================================\n");
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getAverage() {
        return average;
    }

    public String getResult() {
        return result;
    }
}