package polymorphism.Ex3;

public class Employee extends Taxpayer{
    public double pay() {
        System.out.println("Employee: to pay 100");
        return 100;
    }
}
