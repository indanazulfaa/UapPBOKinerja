package tugasPraktikum07;

public class PegawaiTetap extends Pegawai{
    private double upah ; 
    
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah; 
    }
    
    public double getUpah() {
        return upah;
    }
    public void setUpah(double upah) {
        this.upah = upah;
    }
    @Override
    public double gaji(){
        return this.upah ; 
    }
    @Override
    public String toString() {
        return "Nama Pegawai Tetap\t : " + this.getNama() + 
                "\n" + super.toString()+ 
                "\n" + "Upah\t\t\t : " +upah + 
                "\n" + "Pendapatan\t\t : Rp " + gaji()+"\n";
    } 

}
