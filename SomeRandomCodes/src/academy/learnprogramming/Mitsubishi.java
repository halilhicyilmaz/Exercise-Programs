package academy.learnprogramming;



public class Mitsubishi extends Car{
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "'s engine is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi is braking";
    }
}
