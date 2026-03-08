import java.util.*;

public class StudentGradeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to the Student Grade Calculator!");
    System.out.print("Enter the Student's name: ");
    String name = sc.nextLine();

    System.out.print("Marks obtained in Language (out of 100): ");
    double language = sc.nextDouble();

    System.out.print("Marks obtained in Mathematics (out of 100): ");
    double mathematics = sc.nextDouble();

    System.out.print("Marks obtained in Science (out of 100): ");
    double science = sc.nextDouble();

    System.out.print("Marks obtained in Social Studies (out of 100): ");
    double socialStudies = sc.nextDouble();

    System.out.print("Marks obtained in English (out of 100): ");
    double english = sc.nextDouble();

    
    if (language < 0 || language > 100 ||
        mathematics < 0 || mathematics > 100 ||
        science < 0 || science > 100 ||
        socialStudies < 0 || socialStudies > 100 ||
        english < 0 || english > 100) {
      System.out.println("Invalid marks entered! Marks should be between 0 and 100.");
      return;
    }

    double total = language + mathematics + science + socialStudies + english;
    double averagePercent = total / 5;
    System.out.println("--------------------------------------");
    System.out.println("\nStudent Performance Report");
    System.out.println("Student name: " + name);
    System.out.println("Total marks obtained: " + total);
    System.out.println("Average Percent obtained: " + averagePercent);

    if (averagePercent < 60) {
      System.out.println("Grade obtained: F (Fail)");
    } else if (averagePercent < 70) {
      System.out.println("Grade obtained: D (Pass)");
    } else if (averagePercent < 80) {
      System.out.println("Grade obtained: C (Satisfactory)");
    } else if (averagePercent < 90) {
      System.out.println("Grade obtained: B (Good)");
    } else {
      System.out.println("Grade obtained: A (Excellent)");
    }

    sc.close();
  }
}