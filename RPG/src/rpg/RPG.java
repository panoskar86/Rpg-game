/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Java Seminar
 */
public class RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Map<String,String> enter=new HashMap<>();
        enter.put("Panos", "Kar");
        enter.put("John","Pap");
        enter.put("Nick", "Geo");
        enter.put("George", "Xat");
        boolean Login=false;
        Scanner enterGame=new Scanner(System.in);
        
        while(Login==false){
            System.out.println("Give username ");
            String username=enterGame.nextLine();
            
            if(enter.containsKey(username))
            {
                System.out.println("Give password");
                String pword=enterGame.nextLine();
                Login=false;
                
                if (pword.equals(enter.get(username)))
                {   System.out.println("Welcome "+username);
                    Login=true;
                }
                else
                {
                    System.out.println("Wrong password");
                    Login=false;
                }
            }
            else
            {
                System.out.println("Wrong username");
                Login=false;
            }
        }
        
        
       System.out.println("For Superman press 1 , for Wizard press 2 , for Dwarf press 3");
        Scanner in = new Scanner(System.in);
        int character = in.nextInt();
        Hero avatar;
        if(character==1)
        {
            avatar = new Human(200, 1, 100, "Superman", 100, 20);
            System.out.println("You are Superman");
        }
        else if(character==2)
        {
            avatar = new Wizard(200, 50, 300, "Oz", 100, 80);
            System.out.println("You are Oz");
        }
        else
        {
            avatar = new Dwarf(200, 200, 50, "Dwarf", 100, 50);
            System.out.println("You are the Dwarf");
        }
        
         System.out.println("You have "+avatar.getHitpoints()+" hitpoints");
         System.out.println("You have "+avatar.getStrength()+" strength");
         
         
        Enemy trol;
        Scanner input = new Scanner(System.in);
        
        trol = new FirstEnemy(1500);
        System.out.println("press 1 to fight or 2 to run away...");
        int choise = input.nextInt();
        if(choise==1)
        {
            while(avatar.IsAlive() && trol.IsAlive())
            trol.ReceiveDamage(avatar.attack());
            System.out.println("You punshed him ");
            if(trol.IsAlive())
            {
                System.out.println("Trol punshed you too...");
                avatar.ReceiveDamage(trol.attack());
                if(avatar.IsAlive()==false)
                {
                    System.out.println("Game Over");
                }
            }
            else
            {
                System.out.println("First enemy is dead");
            }
        }
        else
        {
            System.out.println("you are chicken...:P");
        }
        
        System.out.println("You meet the second trol");
        System.out.println("press 1 to fight or 2 to run away...");
        int choiise = input.nextInt();
        trol = new SecondEnemy(2000);
        
        if(choiise==1)
        {
            while(avatar.IsAlive() && trol.IsAlive())
            trol.ReceiveDamage(avatar.attack());
            System.out.println("You punshed him");
            if(trol.IsAlive())
            {
                System.out.println("trol punshed you too..");
                avatar.ReceiveDamage(trol.attack());
                if(avatar.IsAlive()==false)
                {
                    System.out.println("Game Over");
                }
            }
            else
            {
                System.out.println("Second Enemy is dead");
            }
        }
        else
        {
            System.out.println("chicken.....");
        }
        
        System.out.println("You have "+avatar.getHitpoints()+" hitpoints");
        
        
        
        
        
        
        
        
    }
    
}
