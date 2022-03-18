package polymorphism.Ex3;

public class Company extends Taxpayer {
    public double pay(){
        System.out.println("Company: to pay 1000");
        return 1000;
    }
}
