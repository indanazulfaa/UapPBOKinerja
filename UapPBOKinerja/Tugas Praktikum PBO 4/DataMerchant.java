package tugas4Pbo;


public class DataMerchant {
    
    static Scanner input = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant){
       Merchant tambahMerc[]= new Merchant[DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++){
            tambahMerc[i]=DataMerchant.merc[i];
        }
        tambahMerc[DataMerchant.merc.length]= merchant;
        return tambahMerc;
        
    }

    public static void tampilData(){
        for (Merchant mch1 : DataMerchant.merc){
            
            System.out.println("=== Tampilan Data Merchant UBFood ===");
            System.out.println("Nama Merchant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga           : " + (int)mch1.getHargaMakanan());
        }
    }
    
    public static Merchant cariMerchant (String nama){
        int index = 0;
        for (int i = 0; i < DataMerchant.merc.length; i++){
            if (DataMerchant.merc[i].getNamaMerchant() == nama){
                index = i;
                break;
            }
        }
        return merc[index];
    }
    
    public static void tampilMerchant(Merchant merchant) {
        System.out.println("=== Tampilan Data Merchant UBFOOD ===");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
    }
    
    public static void updateMerchant(Merchant merchant) {
        System.out.println("## Ubah Data Merchant ##");
        System.out.println("---------------------------------------------");
        System.out.print("Nama Merchant Baru\t : ");
        String namaMerchant = input.nextLine();
        merchant.setNamaMerchant(namaMerchant);
        System.out.print("Nama Produk Baru\t : ");
        String namaProduk = input.nextLine();
        merchant.setNamaProduk(namaProduk);
        System.out.print("Harga Makanan Baru\t : ");
        double hargaMakanan = input.nextDouble();
        merchant.setHargaMakanan(hargaMakanan);
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println("== Data Hasil Update Merchant ==");
        tampilData();
}
