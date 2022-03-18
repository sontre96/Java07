package polymorphism.Ex3;

public class FreeLand extends Taxpayer {
    public double pay() {
        System.out.println("FreeLand: to pay 10");
        return 10;
    }
}
