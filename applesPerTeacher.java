import java.util.Scanner;

public class applesPerTeacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying prompt and reading the number of teachers
        System.out.print("Enter the number of teachers: ");
        int teachers = scanner.nextInt();

        //Enter number of apples
        System.out.print("Enter the number of apples: ");
        int apples = scanner.nextInt();

        //Calculate apples
        int applesPerTeacher = apples / teachers;
        int remainingApples = apples % teachers;

        // Display the results
        System.out.println("Each teacher gets " + applesPerTeacher + " apples");
        System.out.println("Number of apples remaining in the basket is " + remainingApples);
    }

}
