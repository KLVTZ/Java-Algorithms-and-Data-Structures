import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int students;
		GradeCalculator studentGrades;
		DecimalFormat averageFormat = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter the number of students in your class: ");
		students = scan.nextInt();
		studentGrades = new GradeCalculator(students);

		System.out.println("The number of students in your class is " + students + ".");
		System.out.println("Their grades in descending order are: " + studentGrades.sortGrades());
		System.out.println(studentGrades.equals() + "\n");
		System.out.println("The highest grade is: " + studentGrades.findMaximumGrade());
		System.out.println("The average grade is: " + averageFormat.format(studentGrades.averageGrade()));
		System.out.println("The median is: " + studentGrades.medianGrade());
		System.out.println("The mode grade is " + studentGrades.modeGrade());
	}
}
