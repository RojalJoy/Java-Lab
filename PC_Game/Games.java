package PC_Game;
public class Games {
    private String name;
    private double price;

    public Games(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Games{name='" + name + "', price=" + price + '}';
    }
}
