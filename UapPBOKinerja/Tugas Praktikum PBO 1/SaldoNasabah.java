package saldonasabah;

import java.util.Scanner;

public class SaldoNasabah {

     public static double saldoNasabah(int saldoAwal, int setorTambah){
    
        double saldoTotal = saldoAwal + setorTambah - 7000 ;
        
        double hadiah = 5*saldoTotal / 10000;
         
        double sisaSaldo = saldoTotal + hadiah;
         
        return sisaSaldo;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int saldoAwal = scan.nextInt();
        int setorTambah = scan.nextInt();
        
        System.out.println(saldoNasabah(saldoAwal, setorTambah));
        
    }
    
}
