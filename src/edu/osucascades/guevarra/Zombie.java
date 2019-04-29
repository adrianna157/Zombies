package edu.osucascades.guevarra;

import java.util.*;

public class Zombie {

    String name;


    public Zombie(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        //String name  = "Jefree";
        ArrayList<Zombie> zombies = new ArrayList<Zombie>();
        Zombie zombieGeneric = new Zombie("Jefree");
        zombies.add(zombieGeneric);
        zombieGeneric.makeNoise();
        Zombie singingZombie = new SingingZombie("Janet");
        zombies.add(singingZombie);
        singingZombie.makeNoise();
        Zombie groaningZombie = new GroaningZombie("Justin");
        zombies.add(groaningZombie);
        groaningZombie.makeNoise();
        Zombie shoutingZombie = new ShoutingZombie("Joane");
        zombies.add(shoutingZombie);
        shoutingZombie.makeNoise();
        Zombie whisperingZombie = new WhisperingZombie("Joshua");
        zombies.add(whisperingZombie);
        whisperingZombie.makeNoise();

        for (Zombie z : zombies) {
            z.makeNoise();
        }


    }

    public void makeNoise() {
        System.out.println("Generic Zombie Noise");
    }
}
