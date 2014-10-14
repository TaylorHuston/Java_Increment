/*
 * Simple program to demonstrate the difference between pre and post increment/decrement operators
 * From "Java How To Program, 10/e, Early Objects" - Chapter 4
 */

public class Increment {

    public static void main(String[] args) {
        int num = 10;
        System.out.printf("Num before postincrement: %d%n", num);
        System.out.printf("Postincrement num: %d%n", num++);
        System.out.printf("Num after postincrement: %d%n", num);
        
        num = 10;
        
        System.out.printf("Num before preincrement: %d%n", num);
        System.out.printf("Preincrementing num: %d%n", ++num);
        System.out.printf("Num after preincrement: %d%n", num);
    }
    
}
