import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int enteredNumber, remainder, index;
		String holder = "";
		String baseValue = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("The following program converts a decimal value to base two binary.");
		System.out.print("Please enter a decimal value: ");
		enteredNumber = scan.nextInt();

		while (0 != enteredNumber)
		{
			remainder =enteredNumber % 2;
			if (0 != remainder) {
				holder += 1;
			} else { holder += 0; }
			enteredNumber = enteredNumber / 2;
		}
		index = holder.length() - 1;
		while (0 <= index)
		{
			baseValue += holder.charAt(index--);
		}
		System.out.print(baseValue + "\n");
	}
}
