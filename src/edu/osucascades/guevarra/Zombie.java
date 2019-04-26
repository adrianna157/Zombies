package edu.osucascades.guevarra;
import java.util.*;

public class Zombie{

    String name;




    public Zombie(String name){
        this.name = name;

    }

    public void makeNoise(){
     System.out.println("Generic Zombie Noise");
    }
//    public void groan() {
//        System.out.println("grrroooooan. I'm in pain and you will be too if you don't run!" + name);
//    }
//
//    public void shout(){
//            System.out.println("WUUUUGH! You've got fair warning!" + name);
//
//    }
//
//    public void whisper(){
//            System.out.println("shhhh. No noise here. Nothing to fear?!" + name);
//    }
//
//    public void sing() {
//        System.out.println("You may say I'm a dreamer, but I'm not the only one" + name);
//    }
//
//    public void rap(){
//        System.out.println("Reality is wrong. Dreams are for real" + name);
//    }




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

        for(Zombie z:zombies){
            z.makeNoise();
        }




    }
}
