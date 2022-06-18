package TugasPraktikum06;

public class Main {
    static Manusia manusia[] ;
    static MahasiswaFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manajer manager[];
 
    public static void main(String[] args) {
        
        System.out.println("### TUGAS PRAKTIKUM 06 ###");
        System.out.println("NAMA\t : INDANA ZULFA");
        System.out.println("NIM\t : 215150601111013\n");
        
    //Class Manusia
        manusia = new Manusia[3];
        System.out.println("=====================================================");
        System.out.println(" CLASS MANUSIA ");
        System.out.println("=====================================================");
        manusia[0] = new Manusia("Zalfa adirasa", "3409087160020032",false, false);
        manusia[1] = new Manusia("Salsabila Dwi Saputra", "3509087041320051",false, true);
        manusia[2] = new Manusia("Nugroho Putra", "3708167230920073",true, true);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());
 
    //Class Mahasiswa 
        mahasiswa = new MahasiswaFilkom[4];
        System.out.println("=====================================================");
        System.out.println(" CLASS MAHASISWA FILKOM");
        System.out.println("=====================================================");
        mahasiswa[0] = new MahasiswaFilkom("215150601111013", 3.9, "Indana Zulfa","3509086270200031",false,true);
        mahasiswa[1] = new MahasiswaFilkom("206081417900019", 3.7, "Bagas Saputra","3409016281200053",true,true);
        mahasiswa[2] = new MahasiswaFilkom("191509330001022", 4.0, "Putri Tsania","3807608251100041",false,false);
        mahasiswa[3] = new MahasiswaFilkom("181509230001022", 3.8, "Putra hambali","3807608251100041",true,true);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());
        System.out.println(mahasiswa[3].toString());
 
    //Class Pekerja 
        pekerja = new Pekerja[3];
        System.out.println("=====================================================");
        System.out.println(" CLASS PEKERJA "); 
        System.out.println("=====================================================");
        pekerja[0] = new Pekerja(12, 28, "4570917908126","Risky bumirasa","203",true,true);
        pekerja[1] = new Pekerja(8, 40, "6350912908103","Karina Sekar Utami","218",false,true);
        pekerja[2] = new Pekerja(11, 45, "5320916906103","Roby Sanjaya","275",true,false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());
 
    //Class Manager 
        manager = new Manajer[4];
        System.out.println("=====================================================");
        System.out.println(" CLASS MANAJER "); 
        System.out.println("=====================================================");
        manager[0] = new Manajer(2600, 8, 34,"1540913908119","Eka Erlina","2607",false,true);
        manager[1] = new Manajer(3400, 9, 41, "457651597612","Biru Sanjaya","3409",true,true);
        manager[2] = new Manajer(3000, 8, 39, "762879891265","Try Adi Nugroho","3010",true,false);
        manager[3] = new Manajer(2400, 9, 32,"2630914908119","Sherly Yuke","2450",false,true);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());
        System.out.println(manager[3].toString());
 
    //Jumlah 
        System.out.println("=====================================================");
        System.out.println(" TOTAL KESELURUHAN TERDAFTAR "); 
        System.out.println("=====================================================");
        System.out.println("Jumlah Manusia\t : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja\t : " + pekerja.length);
        System.out.println("Jumlah Manager\t : " + manager.length);
    
    }
}
