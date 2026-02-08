/** Project: Lab2
 * Purpose Details: Defines Beasts monster type
 * Course: IST 242
 * Author: Alyssa Thompson
 * Date Developed: 2/4/26
 * Last Date Changed:2/8/26
 * Rev:4
 */

package Monsters;

public final class Beasts extends Monster{

    //Unique Undead Characteristics
    private int ferocityLevel;
    private double clawSharpness;

    public Beasts(String name, int age, Skin skin, int eyes, int health, int ferocityLevel, double clawSharpness){
        super(name, age, skin, eyes, health);
        this.ferocityLevel = ferocityLevel;
        this.clawSharpness = clawSharpness;
    }

    public int getFerocityLevel(){
        return ferocityLevel;
    }

    public double getClawSharpness(){
        return clawSharpness;
    }

    @Override
    public void specialPowers(){
        System.out.println(getName() + " " + "attacks with ferocity level:" + " " + ferocityLevel);
    }
}