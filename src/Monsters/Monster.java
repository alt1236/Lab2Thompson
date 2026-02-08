package Monsters;

public abstract class Monster {

    //Class Variables
    private String name;
    private Skin skin;
    private int age;
    private int numberOfEyes;
    private int health;

    public Monster(String name, int age, Skin skin, int eyes, int health) {
        this.name = name;
        this.age = age;
        this.skin = skin;
        this.numberOfEyes = eyes;
        this.health = health;
    }

    //Getters / Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    //Abstract Behavior
    public abstract void move();
    public abstract void Special_Powers();
}
