/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Java Seminar
 */
package rpg;
import java.util.Random;

public class Hero {
    private int hitpoints;
    private int strength;
    private int intelligence;
    private String name;
    private int stamina;
    private int age;
    Random r;
    public int attack(){return 0;}
    
    
    public Hero() {
        r=new Random();
    }
     
    public Hero(int hitpoints, int strength, int intelligence, String name, int stamina, int age) {
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.intelligence = intelligence;
        this.name = name;
        this.stamina = stamina;
        this.age = age;
        r=new Random();
        
    }
    
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
          this.hitpoints-=damage/this.stamina;
      }
    
    public void increaseHitpoints(){
        if (this.hitpoints<200)
            {this.hitpoints+=r.nextInt(500);
            System.out.println("Twra exeis "+this.hitpoints+" hitpoints");}
        
        else
            { System.out.println("Den exeis xasei hitpoints`");
            }
    }
    
    
   
            
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
    
    
}
