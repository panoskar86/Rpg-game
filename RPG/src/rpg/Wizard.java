/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author Java Seminar
 */
public class Wizard extends Hero {

    public Wizard() {
        super();
    }
    public int spell()
    {
        int damage = this.getIntelligence()*r.nextInt(20);
        return damage;
    }

    public Wizard(int hitpoints, int strength, int intelligence, String name, int stamina, int age) {
        super(hitpoints, strength, intelligence, name, stamina, age);
    }
    
    public int attack()
    {
        return spell();
    }
}
