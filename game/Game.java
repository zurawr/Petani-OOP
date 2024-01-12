/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

/**
 *
 * @author SMK TELKOM 001
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Buat Objek
        Player Hero = new Player();
        Player Enemy = new Player();
        
        //nilai atribut
        Hero.name = "atha";
        Hero.speed = 15;
        Hero.healthPoint = 0;
        
        Enemy.nama = "Nafisya";
        Enemy.damage = 20;
        Enemy.armor = 0;
        
        
        Hero.run();
        
        if(Hero.isDead()){
            System.out.println(Hero.name+" is Dead, Game Over");
        }
        
        Enemy.attack();
//        
        if(Enemy.attacking()){
            System.out.println(Enemy.nama+" is Winner, Game Over ");
        }
        Player petani = new Player();

        // mengisi atribut player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoint = 100;

        // menjalankan method
        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over!");
        }}}
//        
//        Drone yanto = new Drone();
//        yanto.energi = 10;
//        yanto.ketinggian = 100;
//        yanto.kecepatan = 60;
//        yanto.merek = "samsung";
//        
//        yanto.terbang();
//        yanto.matikanMesin();
//    }
    
