package Monsters;

public class Giants extends Monster{

    public Monster(String name, int age, Skin skin, int eyes, int health, Special_Powers specialPowers){
        super(name, age, skin, eyes, health, specialPowers);
    }

    @Override
    public void Special_Powers(){
        System.out.println("dead");
    }
}