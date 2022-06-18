package tugasPraktikum07;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("### TUGAS 7 POLIMORFISME ###");
        System.out.println("Nama\t : Indana Zulfa");
        System.out.println("NIM\t : 215150601111013");
        System.out.println("");
        
        //Class Pegawai Tetap
        System.out.println("=====================================================");
        System.out.println(" PEGAWAI TETAP PERUSAHAAN");
        System.out.println("=====================================================");
        
        Pegawai pegawaiTetap1 = new PegawaiTetap("Sasmita Dwika","35098246210922003",5000000);
        Pegawai pegawaiTetap2 = new PegawaiTetap("Ariguna Swastandiyuka","350876543231999",8000000);
        Pegawai pegawaiTetap3 = new PegawaiTetap("Teguh Purnama","35098246208142000",6000000);
        Pegawai pegawaiTetap4 = new PegawaiTetap("Shinta Putri Sahastika","35031092311995",900000);
        
        System.out.println(pegawaiTetap1.toString());
        System.out.println(pegawaiTetap2.toString());
        System.out.println(pegawaiTetap3.toString());
        System.out.println(pegawaiTetap4.toString());
        
        //Class Pegawai Harian
        System.out.println("=====================================================");
        System.out.println(" PEGAWAI HARIAN PERUSAHAAN");
        System.out.println("=====================================================");
        Pegawai pegawaiHarian1 = new PegawaiHarian("Ricko Adiyaksa","35097562008121990", 35000, 30);
        Pegawai pegawaiHarian2 = new PegawaiHarian("Ambarwati Mahakarya","35087461030111995", 47000, 42);
        Pegawai pegawaiHarian3 = new PegawaiHarian("Ciko Jerico","3509765014082002", 20000, 28);
        Pegawai pegawaiHarian4 = new PegawaiHarian("Intania Purtri Mahardika","3505786015041992", 40000, 46);
        
        System.out.println(pegawaiHarian1.toString());
        System.out.println(pegawaiHarian2.toString());
        System.out.println(pegawaiHarian3.toString());
        System.out.println(pegawaiHarian4.toString());
       
        //Class Sales
        System.out.println("=====================================================");
        System.out.println(" SALES PERUSAHAAN");
        System.out.println("=====================================================");
        Pegawai sales1 = new Sales("Putri Antania", "34065562409121989", 55, 90000 );
        Pegawai sales2 = new Sales("Roy Ferdinanda", "35674094430051993", 34, 86000 );
        Pegawai sales3 = new Sales("Shista Hana", "35987654006091995", 45, 94000 );
        Pegawai sales4 = new Sales("Daffa Dwika Saputra", "34876543216031991", 60, 78000 );
        
        System.out.println(sales1.toString());
        System.out.println(sales2.toString());
        System.out.println(sales3.toString());
        System.out.println(sales4.toString());
        
    }
}
