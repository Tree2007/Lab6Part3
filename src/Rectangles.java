import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Rectangles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        double side1 = 0;
        double side2 = 0;
        double area;
        double perimeter;
        double diagonal;
        boolean valid1 = false;
        boolean valid2 = false;

        //data collecting for side 1
        do {
            System.out.println("Enter length of side 1");
            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                if (side1 > 0) {
                    valid1 = true;
                    scan.nextLine();
                }
                else {
                    System.out.println("You have entered an invalid side length. Please try again");
                    scan.nextLine();
                }
            }
            else {
                System.out.println("You have entered an invalid value type. Please try again");
                scan.nextLine();
            }
        } while (!valid1);
        //data collecting for side 2
        do {
            System.out.println("Enter length of side 2");
            if (scan.hasNextDouble()) {
                side2 = scan.nextDouble();
                if (side2 > 0) {
                    valid2 = true;
                }
                else {
                    System.out.println("You have entered an invalid side length. Please try again");
                    scan.nextLine();
                }
            }
            else {
                System.out.println("You have entered an invalid value type. Please try again");
                scan.nextLine();
            }
        } while (!valid2);
        //math
        area = side1 * side2;
        perimeter = (side1 * 2) + (side2 * 2);
        diagonal = sqrt((pow(side1, 2) + pow(side2, 2)));
        //output
        System.out.printf("%5s %10.2f %5s %10.2f %5s %10.2f %5s %10.2f %5s %10.2f", "Side 1:", side1, "\nSide 2:", side2, "\nArea:", area, "\nPerimeter:", perimeter, "\nDiagonal:", + diagonal);
    }
}