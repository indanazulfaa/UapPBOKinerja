package menghitungluas;

import java.util.Scanner;

public class MenghitungLuas {
        public static int persegi(int s){
        int luas = s * s;
        return luas;
    }
    
     public static int segitiga(double a, double t){
        int luas = (int) ((a * t) / 2);
        return luas;
    }
    
     public static double lingkaranBiasa(double j){
        double luas =  3.14 * j * j;
        int luas2 = (int) luas;
        return luas2;
     }
     
     public static double lingkaranKelipatan(double j){
         double luas = 22/7 * j * j;
        return luas;
     }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihMenu, sisiPersegi;
        
        pilihMenu = scan.nextInt();
        
        if (pilihMenu == 1){
            sisiPersegi = scan.nextInt();
            System.out.println(persegi(sisiPersegi));
        }
        else if (pilihMenu == 2){
            double alasSegitiga = scan.nextDouble();
            double tinggiSegitiga = scan.nextDouble();
            System.out.println(segitiga(alasSegitiga, tinggiSegitiga ));
        } 
        else if (pilihMenu == 3){
            
            double jari2Lingkaran = scan.nextDouble();
            
            if (jari2Lingkaran % 7 == 0){
                System.out.println(lingkaranKelipatan(jari2Lingkaran));
            }
            else {
                System.out.println(lingkaranBiasa(jari2Lingkaran));
            }
        }
        else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    
}
