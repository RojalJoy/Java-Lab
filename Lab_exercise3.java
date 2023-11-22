import java.util.Scanner;

abstract class Games{
    public String G_name;
    private double price;
    public Games(String name,double pri){
        G_name=name;
        price=pri;
    }
    public void showName(){
        System.out.println("Name : "+G_name);
    }
    public double showPrice(){
        return price;
    }
    public abstract String type(String G_type);
}


class Game extends Games{
    int avgPlaytime;
    public Game(String name,double price,int avgPlaytime){
        super(name, price);
        this.avgPlaytime=avgPlaytime;
    }
    @Override
    public String type(String G_type){
        return G_type;
    }
    public void showPlaytime(){
        System.out.println("The avgerage playtime for "+G_name+" is : "+avgPlaytime);
    }
    public double rent(int days){
        return days;
    }
}

final class Customer extends Game{
    int rentdays;
    public Customer(String name,double price,int avgPlaytime){
        super(name, price, avgPlaytime);
    }
    @Override
    public double rent(int days){
        return days*1.2;
    }
}

public class Lab_exercise3 {
    public static void main(String args[])
    {
        System.out.println("\n\n-----------------------------------Using the class that inherited the abstract class----------------------------\n");
        Game g1=new Game("AC1", 6.99, 5);
        g1.showName();
        System.out.println("Price: "+g1.showPrice());
        System.out.println("The type of the game is : "+g1.type("Story Game"));
        g1.showPlaytime();

        System.out.println("\n\n----------------------------------Using the final class-----------------------------------\n");
        Customer c1=new Customer("AC2", 10.99, 8);
        c1.showName();
        System.out.println("Price: "+c1.showPrice());
        System.out.println("The type of the game is : "+c1.type("Story Game"));
        c1.showPlaytime();
        System.out.println("Enter the no of days you want to rent the game : ");
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        System.out.println("The price for renting "+c1.G_name+" for "+days+" days is : "+c1.rent(days));
    }
}
