package LabAssignment.EX2;

import java.util.Scanner;

public class NovablePoint implements Novable {
    private double x;
    private double y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = ");
        double x = scanner.nextDouble();
        System.out.println("y =  ");
        double y = scanner.nextDouble();
        System.out.println("------------------------------------");
        System.out.println("After:");
        NovablePoint novablePoint = new NovablePoint();
        novablePoint.moveUp(x,y);
        novablePoint.moveDown(x,y);
        novablePoint.moveLeft(x,y);
        novablePoint.moveRight(x,y);
    }
    @Override
    public void moveUp(double x, double y){
        x = x;
        y = ++y;
        System.out.println("x: = "+ x + "," + "y ="+ y);
    }
    @Override
    public void moveDown(double x, double y) {
        x = x;
        y = --y;
        System.out.println("x: = "+ x + "," + "y ="+ y);
    }
    @Override
    public void moveLeft(double x, double y) {
        x = --x;
        y = y;
        System.out.println("x: = "+ x + "," + "y ="+ y);
    }
    @Override
    public void moveRight(double x, double y) {
        x = ++x;
        y = y;
        System.out.println("x: = "+ x + "," + "y ="+ y);
    }
}
