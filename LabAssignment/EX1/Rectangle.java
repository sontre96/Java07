package LabAssignment.EX1;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public double getArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of Rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Width of Rectangle: ");
        double width = scanner.nextDouble();

        double AreaRec = width * length;
        System.out.println("Area of Rectangle: " + AreaRec);
        return width * length;
    }
}
