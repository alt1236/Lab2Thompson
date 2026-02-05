package Monsters;

public class Main {
    public static void main(String[] args){

        Monster undead = new Undead();
        undead.setName("Zombie");
        undead.setSkin();
        undead.setAge(104);
        undead.setSpecialPowers(Special_Powers.STRENGTH);
        undead.setNumberOfEyes();
        undead.setHealth();

        Monster undead = new Undead();
        undead.setName("Ghost");
        undead.setSkin();
        undead.setAge(26);
        undead.setSpecialPowers(Special_Powers.INVISIBILITY);
        undead.setNumberOfEyes();
        undead.setHealth();

        Monster beasts = new Beasts();
        beasts.setName("Dragon");
        beasts.setSkin();
        beasts.setAge(2004);
        beasts.setSpecialPowers(Special_Powers.FIRE_BREATH);
        undead.setNumberOfEyes();
        undead.setHealth();

        Monster giants = new Giants();
        giants.setName("Troll");
        giants.setSkin();
        giants.setAge();
        giants.setSpecialPowers(Special_Powers.STRENGTH);
        undead.setNumberOfEyes();
        undead.setHealth();

        Monster giants = new Giants();
        giants.setName("Cyclops");
        giants.setSkin();
        giants.setAge();
        giants.setSpecialPowers(Special_Powers.DURABILITY);
        undead.setNumberOfEyes();
        undead.setHealth();
    }

}
