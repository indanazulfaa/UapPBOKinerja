package TugasPraktikum06;

public class Manusia {
    private String nama ; 
    private String NIK ;
    private boolean jenisKelamin; 
    private boolean menikah ; 
    
    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNIK() {
        return NIK;
    }
    
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
    
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin; 
    }
    public boolean getMenikah() {
        return menikah;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
 
    public double getTunjangan(){
        double tunjangan ; 
        if (this.getJenisKelamin()== true ){
            if(this.getJenisKelamin() == true){
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 15; 
        }
        return tunjangan;
    }
 
    public double getPendapatan(){
    double pendapatan = getTunjangan();
    return pendapatan; 
    }
 
    @Override
    public String toString(){
    System.out.println("Nama\t\t : " + this.getNama());
    System.out.println("NIK\t\t : " + this.getNIK());
    System.out.println("Jenis Kelamin\t : " + (jenisKelamin? "Laki-laki" : "Perempuan" ));
    System.out.println("Pendapatan\t : " +this.getPendapatan() + "$" );
    return " "; 
    } 
}
