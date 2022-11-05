package Assignment_4;

import java.util.*;

/*
 * Write a java code to create user define size vector and store some values
 * till user
 * wants or vector is not full and display vector elements.
*/
public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the vector : ");
        // Take the size of vector as input from user
        int size = input.nextInt();
        Vector<Integer> myVector = new Vector<Integer>(size);

        System.out.println("Input the elements : ");
        // Take the objects to be stored in the vector from the user
        for (int i = 0; i < size; i++) {
            int tmp = input.nextInt();
            myVector.addElement(tmp);
        }
        input.close();

        System.out.println("The values in the vector are : ");
        // Display the values of vector
        System.out.print("{");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + myVector.elementAt(i));
        }
        System.out.print(" }");
    }
}
