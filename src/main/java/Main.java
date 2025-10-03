public class Main {
    public static void main(String[] args) {
        int[] testScores = {43, 57, 68, 71, 79, 83, 87, 92, 98, 100};

        int highScore = testScores[9];
        int lowScore = testScores[0];

        int sum = 0;
        for (int testScore : testScores) {
            sum += testScore;
        }
        double average = (double) sum / testScores.length;

        double median;
        if (testScores.length % 2 == 0) {
            int median1 = testScores[testScores.length / 2 - 1];
            int median2 = testScores[testScores.length / 2];
            median = (median1 + median2) / 2.0;
        } else {
            median = testScores[testScores.length/2];
        }

        System.out.println("Test Scores:");
        for (int i = 0; i < testScores.length; i++) {
            System.out.println(testScores[i]);
        }

        System.out.printf("%nHighest Score: %d%nLowest Score: %d%nAverage Score: %.2f%nMedian Score: %.2f%n", highScore, lowScore,average, median);
    }

}
