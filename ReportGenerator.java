import java.util.*;

class ReportGenerator {

    public static void generateSummary(ArrayList<Student> students) {
        int pass = 0, fail = 0;

        for (Student s : students) {
            if (s.getResult().equals("PASS"))
                pass++;
            else
                fail++;
        }

        System.out.println("\n===== RESULT SUMMARY =====");
        System.out.println("Total Students : " + students.size());
        System.out.println("Passed         : " + pass);
        System.out.println("Failed         : " + fail);
    }

    public static void showTopper(ArrayList<Student> students) {
        if (students.isEmpty())
            return;

        Student topper = students.get(0);

        for (Student s : students) {
            if (s.getAverage() > topper.getAverage()) {
                topper = s;
            }
        }

        System.out.println("\n🏆 TOPPER DETAILS:");
        topper.displayMarksheet();
    }
}