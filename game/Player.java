/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author SMK TELKOM 001
 */
public class Player {
   //atribut
    String name;
    int speed, healthPoint;
    
    String nama;
    int armor, damage;
    
    //method
    void run(){
        System.out.println(name+" is running ...");
        System.out.println("Speed "+speed);
    }
    
    void attack(){
        System.out.println(nama+" is attacking ...");
        System.out.println("damage "+damage);
    }
    
    boolean isDead(){
       if(healthPoint<=0) return true;
            return false;
    }
    
    boolean attacking(){
        if(damage<=20) return true;
        return false;
    }
}
