package PC_Game;


public class Rent {
    private int customerId;
    private String gameTitle;
    private String CustomerName;

    public Rent(int customerId, String gameTitle, String CustomerName) {
        this.customerId = customerId;
        this.gameTitle = gameTitle;
        this.CustomerName = CustomerName;
    }



    public int getCustomerId() {
        return customerId;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    @Override
    public String toString() {
        return "RentDetails{" +
                ", customerId=" + customerId +
                ", gameTitle='" + gameTitle + '\'' +
                ", rentalDate='" + CustomerName + '\'' +
                '}';
    }
}

