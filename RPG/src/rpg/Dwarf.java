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
public class Dwarf extends Hero {
    
    public Dwarf() {
        super();//calls the constructor 
    }
    public int kick()
    {
        int damage = this.getStrength()*r.nextInt(20);
        return damage;
    }

    public Dwarf(int hitpoints, int strength, int intelligence, String name, int stamina, int age) {
        super(hitpoints, strength, intelligence, name, stamina, age);
    }
    
    public int attack()
    {
        return kick();
    }
}
