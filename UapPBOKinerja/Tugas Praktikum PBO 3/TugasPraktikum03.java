package tugaspraktikum03;

import java.util.Scanner;

class Baju {
    String jenis;
    int harga;
    int jumlah;

    public Baju (String jenisBaju, int jumlahBaju){
        this.jenis = jenisBaju;
        this.jumlah = jumlahBaju;
    }
        
    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;
    
    void hargaA(){
        if (jumlah > 100) {
            harga = 95000;
        } else {
            harga = bajuA;
        }
    }
    
    void hargaB(){
        if (jumlah > 100) {
            harga = 120000;
        } else {
            harga = bajuB;
        }
    }
    
    void hargaC(){
        if (jumlah > 100) {
            harga = 160000;
        } else {
            harga = bajuC;
        }
    }
    
    void display(){
    if (jenis.equalsIgnoreCase("a"))
        hargaA();
    else if (jenis.equalsIgnoreCase("b"))
        hargaB();
    else if (jenis.equalsIgnoreCase("c"))
        hargaC();
    
        System.out.println("Jenis Baju Yang Anda Beli\t: " + jenis);
        System.out.println("Harga Per Buah\t\t\t: " + harga);
        System.out.println("Total Harga Keseluruhan\t\t: " + harga * jumlah);
    } 
    
}

public class TugasPraktikum03 {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
        
        System.out.println("Nama\t : Indana Zulfa");
        System.out.println("NIM \t : 215150601111013");
        System.out.println("Kelas\t : PTI-B");
        System.out.println("---------------------------\n");
        
        System.out.println("Pilihan Baju Yang Tersedia Di Toko Erigo : ");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000\n");
        
        System.out.print("===============================================\n\n");
        System.out.print("Baju yang akan anda beli bertipe\t: ");
        String jenis = scan.next().toLowerCase();

        System.out.print("Jumlah baju yang akan anda beli adalah  : " );
        int jumlah = scan.nextInt();
      
        Baju JualBaju = new Baju (jenis, jumlah);
        JualBaju.display();
        
        System.out.println();
        System.out.println("===============================================");
        
    } 
}
