package academy.learnprogramming;

public class Ford extends Car{

    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Ford engine is starting";
    }

    @Override
    public String accelerate() {
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
        return "Ford is braking";
    }
}
