package Monsters;

public class Beasts extends Monster{

    public Monster(String name, int age, Skin skin, int eyes, int health){
        super(name, age, skin, eyes, health);
    }

    @Override
    public void Special_Powers(){
        System.out.println("dead");
    }
}