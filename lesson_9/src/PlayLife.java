import java.util.Scanner;

public class PlayLife {
    public static void main(String args[])
    {
        int row, col, generations, index;
        boolean test = true, checker = true;
        World myWorld = new World(10, 10);
        Scanner scan = new Scanner(System.in);

        System.out.println("The following program allows a user to populate a 10 x 10 board" +
            " by entering a row and a column number.\n");
        System.out.print("Please enter a row and a column number to make alive: ");
        row = scan.nextInt();
        col = scan.nextInt();
        do {
            if (row < 0 || row > 9) {
                System.out.println("\nEnd of populating process");
                test = false;
            } else if (col < 0 || col > 9) {
                System.out.println("\nEnd of populating process");
                test = false;
            } else {
                myWorld.makeAlive(row, col);
                System.out.print("Enter next row and column number to make alive: ");
                row = scan.nextInt();
                col = scan.nextInt();
            }
        } while (test);
        System.out.println();

        System.out.print("Please enter number of generations: ");
        generations = scan.nextInt();
        System.out.print(myWorld);

        for (index = 1; index <= generations; index++)
        {
            myWorld.nextGen();
            checker = myWorld.checker(checker);
            if (!checker) {
                System.out.print("All cells have stopped populating because all are dead");
                System.exit(0);
            }
            System.out.print(myWorld);
            System.out.println();
        }

    }
}
