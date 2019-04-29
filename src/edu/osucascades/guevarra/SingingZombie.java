package edu.osucascades.guevarra;

public class SingingZombie extends Zombie {
    SingingZombie(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("You may say I'm a dreamer, but I'm not the only one" + name);
    }
}
