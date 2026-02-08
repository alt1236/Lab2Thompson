package Monsters;



public class Main {
    public static void main(String[] args){

        Monster undead1 = new Undead("Zombie", 104, Skin.DECAYED, 2, 56);
        System.out.println("Undead 1" + " " + undead1.getName() + undead1.getAge());

        undead1.Special_Powers();

        Monster undead2 = new Undead("Ghost", 26, Skin.TRANSLUCENT, 0, 87);

        Monster beasts1 = new Beasts("Dragon", 2468, Skin.SCALES, 2, 100);

        Monster giants1 = new Giants("Troll", 1647, Skin.ROUGH, 3, 74);

        Monster giants2 = new Giants("Cyclops", 3637, Skin.ROUGH, 1, 68);



    }

}
