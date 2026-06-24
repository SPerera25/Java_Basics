import java.util.Scanner;
public class While_loop {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer number(0-100): ");
        num = scanner.nextInt();
        while(num<100){
            System.out.println("The number is: " + num);
            System.out.print("Enter another integer number: ");
            num = scanner.nextInt();
        }
        System.out.println("The final number is: " + num);
        scanner.close();
    }
}
