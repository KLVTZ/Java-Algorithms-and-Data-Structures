import java.text.NumberFormat;
import java.util.*;

public class lesson {

	public static void main(String[] args) {
		int principle;
		double interestRate, fiveYears, tenYears, twentyYears;
		Scanner scan;
		NumberFormat priceFormat;

		System.out.println("The following program calculates future values of investment.\n");
		scan = new Scanner(System.in);

		System.out.print("Please enter Principle investment: ");
		principle = scan.nextInt();

		System.out.print("Please enter Decimal Interest Rate: ");
		interestRate = scan.nextDouble();

		fiveYears = principle * Math.pow(1 + interestRate, 5);
		tenYears = principle * Math.pow(1 + interestRate, 10);
		twentyYears = principle * Math.pow(1 + interestRate, 20);

		priceFormat = NumberFormat.getCurrencyInstance();

		System.out.print("\nThe future value of investment in five years is " + priceFormat.format(fiveYears));
		System.out.print("\nThe future value of investment in ten years is " + priceFormat.format(tenYears));
		System.out.print("\nThe future value of investment in twenty years is " + priceFormat.format(twentyYears));

		System.exit(0);
	}
}
