/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;
import java.util.Random;
/**
 *
 * @author Java Seminar
 */
public class Enemy {
    int hitpoints;
    Random r;   
    
    public Enemy() {
        r = new Random();
    }

    public Enemy(int hitpoints) {
        this.hitpoints = hitpoints;
    }
    
    public int attack(){return 0;}
     
    
    public boolean IsAlive(){
        if (this.hitpoints>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void ReceiveDamage(int damage)
    {
        //this.hitpoints=this.hitpoints-damage;
        this.hitpoints-=damage;
    }

 
    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}  
    
  