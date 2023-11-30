import lab4.*;
public class ICustomer implements IGames, IRent {
    public String g1 = "AC1", g2 = "AC2", g3 = "AC3", g4 = "AC4";
    public int p1 = 10, p2 = 12, p3 = 13, p4 = 14;
    public double r1 = 100, r2 = 120, r3 = 130, r4 = 140;

    public void display() {
        System.out.println("1. " + g1 + " Playtime : " + p1 + " Price : " + r1);
        System.out.println("1. " + g2 + " Playtime : " + p2 + " Price : " + r2);
        System.out.println("1. " + g3 + " Playtime : " + p3 + " Price : " + r3);
        System.out.println("1. " + g4 + " Playtime : " + p4 + " Price : " + r4);
    }

    public void rentCalculator(String name, int days) {
        System.out.println("Name: " + name);
        System.out.println("The total price will be: " + days * 0.5);
    }
}
