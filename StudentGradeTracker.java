import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }
        double average = calculateAverage(grades);
        int highest = findHighestScore(grades);
        int lowest = findLowestScore(grades);

        System.out.println("Average score: " + average);
        System.out.println("Highest score:" + highest);
        System.out.println("Lowest score:" + lowest);
        scanner.close();
    }
    public static double calculateAverage(ArrayList<Integer> grades){
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to find the highest score
    public static int findHighestScore(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest score
    public static int findLowestScore(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

}
