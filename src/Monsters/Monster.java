/** Project: Lab2
 * Purpose Details: Defines abstract parent Monster class
 * Course: IST 242
 * Author: Alyssa Thompson
 * Date Developed: 2/4/26
 * Last Date Changed:2/8/26
 * Rev:4
 */

package Monsters;

public abstract class Monster {

    //Class Variables
    private String name;
    private int age;
    private Skin skin;
    private int numberOfEyes;
    private int health;

    public Monster(String name, int age, Skin skin, int numberOfEyes, int health) {
        this.name = name;
        this.age = age;
        this.skin = skin;
        this.numberOfEyes = numberOfEyes;
        this.health = health;
    }

    //Getters / Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //Abstract Behavior
    public abstract void specialPowers();
}
