package tugasPraktikum07;

public class Sales extends Pegawai{
    private int penjualan ; 
    private double komisi ;
    
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi ; 
    }
    public int getPenjualan() {
        return penjualan;
    }
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    
    public double getKomisi() {
        return komisi;
    }
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }
 
    @Override
    public double gaji(){
        double gaji ; 
        gaji = this.penjualan * this.komisi;
        return gaji ; 
    }
    
    @Override
    public String toString() {
        return "Naman Sales\t\t : " + this.getNama() + 
                "\n" + super.toString()+ 
                "\n" + "Total Penjualan\t\t : " + this.penjualan + 
                "\n" + "Besar Komisi\t\t : " + this.komisi + 
                "\n" + "Pendapatan\t\t : Rp" + gaji() + "\n";
    }
}
