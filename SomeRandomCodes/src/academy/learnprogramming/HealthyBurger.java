package academy.learnprogramming;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat, double price) {
        super("HealthyBurger", meat,price,"Healthy Bread");
    }
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;

    }
    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("One order of Beyond Burger on Honeywheat Bread with " + healthyExtra1Name + " " + healthyExtra2Name);
        return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}

