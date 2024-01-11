package Exercise;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import PC_Game.Customer;
import PC_Game.Rent;
import PC_Game.Games;
public class LabExercise_8 {
    public static void main(String[] args) {


        // Creating an ArrayList to store Person objects
        ArrayList<Games> GameList = new ArrayList<>();

        // Adding Person objects to the ArrayList
        GameList.add(new Games("Assassin's Creed Valhalla", 25));
        GameList.add(new Games("Far Cry 3", 30));
        GameList.add(new Games("Witcher: Wild Hunt 3", 22));

        // Displaying the contents of the ArrayList
        for (Games Game : GameList) {
            System.out.println(Game);
        }




        //For entering customer details
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the customer ID : ");
            int ID=sc.nextInt();
            System.out.println("Enter the name of the customer :");
            String Cname=sc.next();
            System.out.println("Enter the age : ");
            int Cage=sc.nextInt();

        Set<Customer> customerSet = new HashSet<>();

        Customer customer1 = new Customer(ID, Cname, Cage);

        customerSet.add(customer1);


        // Print all customers in the set
        for (Customer customer : customerSet) {
            System.out.println(customer);
        }

        
        

        //Rent
        List<Rent> rentDetailsList = new ArrayList<>();

        // Adding rent details to the list
        rentDetailsList.add(new Rent(ID,Cname,"Assassin's Creed Valhalla" ));

        // Displaying rent details from the list
        System.out.println("Rent Details:");
        rentDetailsList.forEach(System.out::println);

    }
}
