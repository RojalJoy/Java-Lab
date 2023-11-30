
import java.util.Scanner;
public class Lab_Exercise_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ICustomer c1=new ICustomer();
        c1.display();
        System.out.println("Enter the name of the game you want to rent and the number of days you want to rent it");
        String name=sc.nextLine();
        int days=sc.nextInt();
        c1.rentCalculator(name, days);

    }

    
}
