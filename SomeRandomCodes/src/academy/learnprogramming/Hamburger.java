package academy.learnprogramming;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
        if (addition1Name != null) {
            this.price += addition1Price;
        }
    }
    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
        if (addition2Name != null) {
            this.price += addition2Price;
        }
    }
    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
        if (addition3Name != null) {
            this.price += addition3Price;
        }
    }
    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
        if (addition4Name != null) {
            this.price += addition4Price;
        }
    }
    public double itemizeHamburger() {
        System.out.println("One order of " + name + " on " + breadRollType + " with " + addition1Name + " " + addition2Name + " " + addition3Name + " " + addition4Name);
        return (price);
    }
}

