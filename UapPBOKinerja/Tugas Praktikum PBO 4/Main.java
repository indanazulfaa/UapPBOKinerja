package tugas4Pbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        DataMerchant.tampilData();
        System.out.println();

       //tambah data merchant dengan inputan
        System.out.println("## Menambahkan Data Merchant Melalui Input ##");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan Nama Merchant\t : ");
        String namaMerchant = input.nextLine();
        System.out.print("Masukkan Nama Produk\t : ");
        String namaProduk = input.nextLine();
        System.out.print("Masukkan Harga Makanan\t : ");
        double hargaMakanan = input.nextDouble();
        System.out.println("---------------------------------------------");
        input.nextLine();

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, hargaMakanan));
        System.out.println();

        //menampilkan data merchant Setelah ditambahkan
        DataMerchant.tampilData();
        System.out.println();
    }
}
