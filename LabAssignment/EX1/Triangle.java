package LabAssignment.EX1;

import java.util.Scanner;

public class Triangle extends Shape {
    private double base;
    private double height;

    public double getArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Base of Rectangle: ");
        double base = scanner.nextDouble();

        System.out.println("Height of Rectangle: ");
        double height = scanner.nextDouble();

        double AreaTri = (base * height)/2;
        System.out.println("Area of Triangle: "+ AreaTri);
        return (base * height)/2;
    }
}
