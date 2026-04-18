import java.util.*;

public class MainSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    static ResultProcessor processor = new ResultProcessor();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== EXAMINATION SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Marksheet");
            System.out.println("3. Search Student");
            System.out.println("4. Result Summary");
            System.out.println("5. Topper");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAll();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    ReportGenerator.generateSummary(students);
                    break;
                case 5:
                    ReportGenerator.showTopper(students);
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Semester: ");
        int sem = sc.nextInt();

        int[] marks = new int[6];
        System.out.println("Enter marks for 6 subjects:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student s = new Student(roll, name, dept, sem, marks);
        s.calculate(processor);

        students.add(s);
        System.out.println(" Student added successfully!");
    }

    static void viewAll() {
        if (students.isEmpty()) {
            System.out.println("No records found!");
            return;
        }

        for (Student s : students) {
            s.displayMarksheet();
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.getRollNo() == roll) {
                s.displayMarksheet();
                return;
            }
        }

        System.out.println(" Student not found!");
    }
}