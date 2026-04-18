class GradeCalculator {

    public static String getGrade(double avg) {
        if (avg >= 90)
            return "A+";
        else if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B+";
        else if (avg >= 60)
            return "B";
        else if (avg >= 50)
            return "C";
        else
            return "F";
    }
}