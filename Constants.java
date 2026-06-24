public class Constants {
    public static void main (String []args){
        final int MAX_AGE = 100; // This is a constant variable
        System.out.println("The maximum age is: " + MAX_AGE);
        // MAX_AGE = 120;  This will cause a compilation error because MAX_AGE is final
    }
    
}
