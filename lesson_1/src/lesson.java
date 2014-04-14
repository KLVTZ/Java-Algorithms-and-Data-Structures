import java.text.DecimalFormat;

public class lesson {
    public static void main (String [] args) {
        DecimalFormat fmt = new DecimalFormat("#.##");

        final float PI = 3.1415f;

        float radius = 3.2f;
        float perimeter = 2 * PI * radius;
        float area = PI * radius * radius;

        System.out.println("The perimeter of the circle is: " + fmt.format(perimeter) + " inches.");
        System.out.println("The area of the circle is: " + fmt.format(area) + " inches.");

        System.exit(0);
    }
}
