import java.util.Scanner;
class Get_Inputs {
    public static void main(String []args){

        String name;
        int age;
        double marks;
        boolean isStudent;
        char grade;

        Scanner scanner = new Scanner(System.in);

        // Get an STRING input
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // Get an INTEGER input
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // Get a DOUBLE input
        System.out.print("Enter your marks: ");
        marks = scanner.nextDouble();

        // Get a BOOLEAN input
        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        // Get a CHARACTER input
        System.out.print("Enter your grade: ");
        grade = scanner.next().charAt(0);

        System.out.println("\nYour name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your marks: " + marks);
        System.out.println("Are you a student? " + isStudent);
        System.out.println("Your grade: " + grade);

        scanner.close();
    }
}
