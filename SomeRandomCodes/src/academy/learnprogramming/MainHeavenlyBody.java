package academy.learnprogramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainHeavenlyBody {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa", 3.5);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Jupiter", 1);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        for (HeavenlyBody body : solarSystem.values()) {
            if (!body.getSatellites().isEmpty()) {
                System.out.println("Moons of " + body.getName());
                for (HeavenlyBody jupiterMoon : body.getSatellites()) {
                    System.out.println("\t" + jupiterMoon.getName());
                }
            }
        }
    }
}
