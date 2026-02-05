package Monsters;

public class Main {
    public static void main(String[] args){

        Monster undead = new Undead();
        undead.setName("Zombie");
        undead.setSkin();
        undead.setAge(104);
        undead.setSpecialPowers(Special_Powers.STRENGTH);
        undead.setNumberOfEyes(2);
        undead.setHealth(56);

        Monster undead = new Undead();
        undead.setName("Ghost");
        undead.setSkin();
        undead.setAge(26);
        undead.setSpecialPowers(Special_Powers.INVISIBILITY);
        undead.setNumberOfEyes(0);
        undead.setHealth(87);

        Monster beasts = new Beasts();
        beasts.setName("Dragon");
        beasts.setSkin();
        beasts.setAge(2468);
        beasts.setSpecialPowers(Special_Powers.FIRE_BREATH);
        undead.setNumberOfEyes(2);
        undead.setHealth(100);

        Monster giants = new Giants();
        giants.setName("Troll");
        giants.setSkin();
        giants.setAge(1647);
        giants.setSpecialPowers(Special_Powers.STRENGTH);
        undead.setNumberOfEyes(3);
        undead.setHealth(74);

        Monster giants = new Giants();
        giants.setName("Cyclops");
        giants.setSkin();
        giants.setAge(3637);
        giants.setSpecialPowers(Special_Powers.DURABILITY);
        undead.setNumberOfEyes(1);
        undead.setHealth(68);
    }

}
