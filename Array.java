import java.util.Scanner;
public class Array{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        //This creates an array that can store 5 integers.

        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        for(int i=0; i<numbers.length; i++){
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }
        scanner.close();
    }
}