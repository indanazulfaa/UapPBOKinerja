package TugasPraktikum06;

public class Manajer extends Pekerja{
    private int lamaKerja ;

    public Manajer(int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(jamKerja, hariKerja, NIP, nama, NIK,jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }
 
    public int getLamaKerja() {
        return lamaKerja;
    }
    
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
 
    @Override
    public String toString(){
        System.out.println("Nama\t\t : " + this.getNama());
        System.out.println("NIK\t\t : " + this.getNIK());
        System.out.println("NIP\t\t : " + this.getNIP());
        System.out.println("Jenis Kelamin\t : " + (this.getJenisKelamin()? "Laki-laki":"Perempuan"));
        System.out.println("Pendapatan\t : " + (this.getGaji() + (this.getBonus()+(this.getBonus()* 30/100))+ (this.getTunjangan() + 15)) + "$");
        System.out.println("Bonus\t\t : " +(this.getBonus() + (this.getBonus()* 30/100)) + "$");
        System.out.println("Gaji\t\t : " + this.getGaji() + "$");
        System.out.println("Status\t\t : " + this.getStatus());
        System.out.println("Lama Kerja\t : " + this.getLamaKerja() + " hari");
        return "" ; 
    }
}

