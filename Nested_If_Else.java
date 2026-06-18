// Find the largest number among three numbers using nested if-else statements
class Nested_If_Else {
    public static void main(String []args) {
        int num1 = 10, num2 = 20, num3 = 30, largestNum;

        if (num1 > num2) {
            if (num1 > num3) {
                largestNum = num1;
            }
            else {
                largestNum = num3;
            }
        } 
        
        else {
            if (num2 > num3) {
                largestNum = num2;
            }
            else {
                largestNum = num3;
            }
        }

        System.out.println("The largest number is: " + largestNum);
    }
}