/** Project: Lab2
 * Purpose Details: Defines Undead monster type
 * Course: IST 242
 * Author: Alyssa Thompson
 * Date Developed: 2/4/26
 * Last Date Changed:2/8/26
 * Rev:4
 */

package Monsters;

public final class Undead extends Monster{

    //Unique Undead Characteristics
    private int decayLevel;
    private boolean regenerates;

    public Undead(String name, int age, Skin skin, int eyes, int health, int decayLevel, boolean regenerates){
        super(name, age, skin, eyes, health);
        this.decayLevel = decayLevel;
        this.regenerates = regenerates;
    }

    public int getDecayLevel(){
        return decayLevel;
    }

    public boolean canRegenerate(){
        return regenerates;
    }

    @Override
    public void specialPowers(){
        System.out.println(getName() + " " + "regenerates despite decay level:" + " " + decayLevel);
    }
}
