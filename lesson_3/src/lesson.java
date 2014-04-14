import java.util.Scanner;

public class lesson {

	public static void main(String[] args) {
		String userID, password;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please login!\n");
		System.out.print("User ID: ");
		userID = scan.next();
		System.out.print("Password: ");
		password = scan.next();

		if ("admin".equals(userID) && "open".equals(password))
		{
			System.out.println("Welcome.");
		} else if ("admin".equals(userID) && ! "open".equals(password))
		{
			System.out.println("\nWrong Password.");
		} else
		{
			System.out.println("Get out of here!");
		}
		System.exit(0);
	}
}
