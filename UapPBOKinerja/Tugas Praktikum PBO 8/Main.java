package TugasPraktikum08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selamat Datang Di Game Defend FILKOM!!");
        System.out.print("Silahkan masukkan nama player : ");
        String namePlayer = scan.nextLine();
        
        int role = 0;
        int countChance = 0;
        boolean start = true;

        while (true) {
            start = true;
            System.out.println("List daftar karakter : "
                + "\n1. Magician"
                + "\n2. Healer"
                + "\n3. Warrior");
            System.out.println("Silahkan pilih karakter yang Anda inginkan : ");
        
            try { 
                String roles = scan.nextLine();
                role = Integer.valueOf(roles);
            }
            catch (Exception e) {
                start = false;
            }
 
            if (start && role > 0 && role < 4) {
                break;
            }
            else if (!start) {
                System.out.println("Tolong masukkan angka ya !!\n");
                
            } 
            else {
                System.out.println("Tolong pilih karakter yang tersedia !!");
            }
        }

        Titan titan = new Titan();
        Character karakter = null;
        System.out.println();
        System.out.printf("Selamat datang, %s !%n", namePlayer);
        
        // Cek Role
        switch (role) {
            case 1:
                karakter = new Magician();
                karakter.info();
                break;
            case 2:
                karakter = new Healer();
                ((Healer) karakter).info();
                break;
            case 3:
                karakter = new Warrior();
                ((Warrior) karakter).info();
                break;
            default:
        }
        
        while (titan.getHP() > 0 && karakter.getHP() > 0) {
            countChance++;
            System.out.println();
            System.out.printf("========== TURN %d ==========%n", countChance);
            System.out.println("Enemy's HP\t: " + titan.getHP());
            System.out.printf("%s's HP\t: %d%n", namePlayer, karakter.getHP());
            
            if (countChance % 2 == 0 && karakter instanceof Healer) {
                    ((Healer) karakter).heal();
                }
            if (titan.attack() == true) {
                karakter.receiveDamage(titan.getAttack());
            }
            if (karakter.attack() == true) {
                titan.receiveDamage(karakter.getAttack());
            }
        }
            if (titan.getHP() <= 0) {
                titan.setHP(0);
            } 
            else if (karakter.getHP() <= 0) {
                karakter.setHP(0);
            }  
            
        String output = titan.getHP() <= 0 ? namePlayer : "Titan";
        System.out.println("============================");
        System.out.println(output + " menang\n");
        
        System.out.println("========== PLAYER ==========");
            karakter.info();
        System.out.println("\n========== MUSUH ===========");
            titan.info();
    } 

}
