/** Project: Lab2
 * Purpose Details: Defines Giants monster type
 * Course: IST 242
 * Author: Alyssa Thompson
 * Date Developed: 2/4/26
 * Last Date Changed:2/8/26
 * Rev:4
 */

package Monsters;

public final class Giants extends Monster{

    public Giants(String name, int age, Skin skin, int eyes, int health){
        super(name, age, skin, eyes, health);
    }

    @Override
    public void specialPowers(){
        System.out.println(getName() + " " + "crushes enemies with colossal strength");
    }
}