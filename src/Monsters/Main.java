/** Project: Lab2
 * Purpose Details: Main class used to instantiate monster objects, demonstrate inheritance, abstraction, and polymorphism
 * Course: IST 242
 * Author: Alyssa Thompson
 * Date Developed: 2/4/26
 * Last Date Changed:2/8/26
 * Rev:4
 */

package Monsters;

public class Main {
    public static void main(String[] args){

        Monster undead1 = new Undead("Zombie", 104, Skin.DECAYED, 2, 56, 80,true);
        Monster undead2 = new Undead("Ghost", 26, Skin.TRANSLUCENT, 0, 87, 10, false);
        Monster beasts1 = new Beasts("Dragon", 2468, Skin.SCALES, 2, 100, 10, 9.5);
        Monster giants1 = new Giants("Troll", 1647, Skin.ROUGH, 3, 74, 15.5,90);
        Monster giants2 = new Giants("Cyclops", 3637, Skin.ROUGH, 1, 68,18.2,95);

        System.out.println("Name: " + undead1.getName());
        System.out.println("Age: " + undead1.getAge());
        System.out.println("Skin: " + undead1.getSkin());
        System.out.println("Eyes: " + undead1.getNumberOfEyes());
        System.out.println("Health: " + undead1.getHealth());
        undead1.specialPowers();
        System.out.println("--------------------");

        System.out.println("Name: " + undead2.getName());
        System.out.println("Age: " + undead2.getAge());
        System.out.println("Skin: " + undead2.getSkin());
        System.out.println("Eyes: " + undead2.getNumberOfEyes());
        System.out.println("Health: " + undead2.getHealth());
        undead2.specialPowers();
        System.out.println("--------------------");

        System.out.println("Name: " + beasts1.getName());
        System.out.println("Age: " + beasts1.getAge());
        System.out.println("Skin: " + beasts1.getSkin());
        System.out.println("Eyes: " + beasts1.getNumberOfEyes());
        System.out.println("Health: " + beasts1.getHealth());
        beasts1.specialPowers();
        System.out.println("--------------------");

        System.out.println("Name: " + giants1.getName());
        System.out.println("Age: " + giants1.getAge());
        System.out.println("Skin: " + giants1.getSkin());
        System.out.println("Eyes: " + giants1.getNumberOfEyes());
        System.out.println("Health: " + giants1.getHealth());
        giants1.specialPowers();
        System.out.println("--------------------");

        System.out.println("Name: " + giants2.getName());
        System.out.println("Age: " + giants2.getAge());
        System.out.println("Skin: " + giants2.getSkin());
        System.out.println("Eyes: " + giants2.getNumberOfEyes());
        System.out.println("Health: " + giants2.getHealth());
        giants2.specialPowers();
        System.out.println("--------------------");



    }

}
