package PC_Game;

public class Customer {
    private int customerId;
    private String name;
    private int age;

    public Customer(int customerId, String name, int age) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}