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
public class FirstEnemy extends Enemy{

    public FirstEnemy() {
        super();
    }

    public FirstEnemy(int hitpoints) {
        super(hitpoints);
    }
    
    public int Kick(){
        int damage=r.nextInt(1200);
        return damage;
    }
    
    public int attack()
    {
        return Kick();
    }
}
