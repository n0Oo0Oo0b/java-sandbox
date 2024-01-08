import java.util.Scanner;

enum Grade {
    A,
    B,
    C,
    U,
}

public class GradingSystem {
    private static int calculatePercentage(int studentScore, int maximumPossibleScore) {
        double fraction = (double)studentScore / maximumPossibleScore;
        return (int)Math.round(fraction * 100);
    }

    private static Grade getGrade(int studentPercentage) {
        if (studentPercentage >= 80) {
            return Grade.A;
        } else if (studentPercentage >= 70) {
            return Grade.B;
        } else if (studentPercentage >= 60) {
            return Grade.C;
        } else {
            return Grade.U;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentScore = scanner.nextInt();
        int maximumPossibleScore = scanner.nextInt();

        int scorePercentage = calculatePercentage(studentScore, maximumPossibleScore);
        Grade studentGrade = getGrade(scorePercentage);

        System.out.printf("Student grade: %s", studentGrade);
    }
}
