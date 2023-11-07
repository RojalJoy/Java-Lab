import java.util.*;
class Games
{
    public int price1,price2,price3;//public access specifier
    private int price4=100;//Private access specifier
    String gName1,gName2;//Default access specifier
    Games()//Defult Constructor
    {
        gName1="Assasin's Creed 1";
        gName2="Assasin's Creed 2";
    }
    Games(int p1,int p2)//Constructor overloading(initialize intergers)
    {
        price1=p1;
        price2=p2;
    }
    Games(String g1,String g2)//Constructor overloading(initialize String)
    {
        gName1=g1;
        gName2=g2;
    }

    public void add()//Method overloading(with no arguments)
    {   System.err.println("The price of 2 random games are : "+price1+" and "+price2);}
    public void showGames()
    {    System.err.println("The games are : \n"+gName1+" \n"+gName2);    }
    public void add(int p1,int p2)//Method overloading (with 2 arguments)
    {    System.err.println("The sum of price of 2 games with price "+p1+" and "+p2+" is : "+(p1+p2));   }
    public int add(int p1,int p2,int p3)//Method overloading (with 3 arguments)
    {    return p1+p2+p3;   }
    public int display()
    {   System.err.println("The value printed is a private value and is accesse using a function. ");
        return price4; }
    
}
public class LabExercise1 

{
    public static void main(String args[])
    {
        int result3;
        Scanner sc=new Scanner(System.in);

        System.err.println("Enter the name of 2 games : ");
        String game1=sc.nextLine();
        String game2=sc.nextLine();
        Games g1=new Games(game1,game2);//Parametrized Contructor
        g1.showGames();
        System.err.println(g1.display());

        Games g2=new Games();//Default Constructor
        g2.showGames();

        System.err.println("Enter the prices of the entered game : ");
        int p1=sc.nextInt();
        int p2=sc.nextInt();


        Games a1=new Games(10,20);//Passing values as arguments through constrctor
        a1.add();//Funtion with no arguments and no return value
        
        a1.add(p1,p2);//Funtion with arguments and no return value
        result3=a1.add(100,150,120);//Function with arguments and return value
        System.err.println("The result when adding the prices of 3 games : "+result3);

        
        
    }   
}
