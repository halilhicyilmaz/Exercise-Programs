package academy.learnprogramming;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", 19.10, "Bread");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to a Deluxe Burger");
    }
}

