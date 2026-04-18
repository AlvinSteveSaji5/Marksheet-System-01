class ResultProcessor {

    public int calculateTotal(int[] marks) {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum;
    }

    public double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }

    public String getResultStatus(int[] marks) {
        for (int m : marks) {
            if (m < 35) {
                return "FAIL";
            }
        }
        return "PASS";
    }
}