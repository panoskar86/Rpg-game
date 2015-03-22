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
public class Human extends Hero{
    public Human() {
        super();//kalei ton constructor ths anw klashs
    }
    public int hit()
    {
        int damage = this.getStrength()*r.nextInt(2);
        return damage;
    }

    public Human(int hitpoints, int strength, int intelligence, String name, int stamina, int age) {
        super(hitpoints, strength, intelligence, name, stamina, age);
    }
    public int attack()
    {
        return hit();
    }
}
