/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author Πανος
 */
public class SecondEnemy extends Enemy{

    public SecondEnemy() {
        super();
    }

    public SecondEnemy(int hitpoints) {
        super(hitpoints);
    }
    
    public int strongKick(){
        int damage=r.nextInt(2000);
        return damage;
    }
    
    public int attack(){
        return strongKick();}
}
