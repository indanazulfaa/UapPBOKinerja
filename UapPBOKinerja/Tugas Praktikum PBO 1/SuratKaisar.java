package suratkaisar;

import java.util.Scanner;

public class SuratKaisar {

    public static void kartuKaisar(String teksAwal, int nilaiGeser){
        String teksSandi = "";
        char huruf;
        
        for(int i = 0; i < teksAwal.length(); ++i){
            huruf = teksAwal.charAt(i);
                if(huruf >= 'a' && huruf <= 'z'){
                    huruf = (char)(huruf + nilaiGeser);
                    
                      if(huruf > 'z'){
                        huruf = (char)(huruf + 'a' - 'z' - 1);
                      }
                        teksSandi = teksSandi + huruf;
                }
                else if(huruf >= 'A' && huruf <= 'Z'){
                    huruf = (char)(huruf + nilaiGeser);
                    
                     if(huruf > 'Z'){
                        huruf = (char)(huruf + 'A' - 'Z' - 1);
                     }
                        teksSandi = teksSandi + huruf;
                }
                else {
                    teksSandi = teksSandi + huruf;
                }
       }
            System.out.println(teksSandi);
     }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String teksAwal = scan.nextLine();
        int nilaiGeser = scan.nextInt();
        
        kartuKaisar(teksAwal, nilaiGeser);
        
    }
    
}
