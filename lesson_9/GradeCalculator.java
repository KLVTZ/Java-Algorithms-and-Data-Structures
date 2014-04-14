import java.util.Random;

public class GradeCalculator {
	int index;
	int [] students;
	int [] studentBackup;
	Random rand = new Random();

	public GradeCalculator(int numberOfStudents) {
		this.students = new int [numberOfStudents];
		for (index = 0; index < this.students.length; index++)
		{
			students[index] = rand.nextInt(100) + 1;
		}
	}

	public String sortGrades()
	{
		String sortedGrades = "";
		int hand, temp;

		for (index = 1; index < this.students.length; index++) {
			hand = index;
			temp = students[index];

			while (0 != hand && students[hand - 1] > temp )
			{
				students[hand] = students[hand - 1];
				hand--;
			}
			students[hand] = temp;
		}
		studentBackup = new int[students.length];
		for (index = 0; index < students.length; index++) {
			studentBackup[index] = students[index];
		}
		for (index = 0; index < students.length; index++) {
			sortedGrades += students[index] + " ";
		}
		return sortedGrades;
	}

	public String equals()
	{
		boolean isEqual = true;
		if (students.length != studentBackup.length) {
			isEqual = false;
		} else {
			for (index = 0; index < students.length && isEqual; index++) {
				if (Math.abs(students[index] - studentBackup[index]) > 0.001 ) {
					isEqual = false;
				}
			}
		}
		if (isEqual) {
			return "\nStudent grades and their backup match!";
		}
		return "\nStudent grades and their backup
			t match!";
	}

	public int findMaximumGrade()
	{
		return students[students.length - 1];
	}

	public double averageGrade()
	{
		double total = 0.0;
		int numberOfStudents = students.length;
		for (index = 0; index < students.length; index++) {
			total += students[index];
		}
		return total / numberOfStudents;
	}

	public int medianGrade()
	{
		return students[(students.length - 1) / 2 ];
	}

	public int modeGrade()
	{
		int maxValue = 0, maxCount = 0, count, hand;

		for (index = 0; index < students.length; index++) {
			count = 0;
			for (hand = 0; hand < students.length; ++hand)
			{
				if(students[hand] == students[index]) {
					++count;
				}
			}
			if(count > maxCount)
			{
				maxCount = count;
				maxValue = students[index];
			}
		}
		return maxValue;
	}
}
