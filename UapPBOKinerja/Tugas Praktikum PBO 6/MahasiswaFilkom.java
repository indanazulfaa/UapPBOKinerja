package TugasPraktikum06;

public class MahasiswaFilkom extends Manusia {
    private String NIM ; 
    private double IPK ; 
    
    public MahasiswaFilkom(String NIM, double IPK, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }
    
    public String getNIM() {
        return NIM;
    }
    
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public double getIPK() {
        return IPK;
    }
    
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    
    public String getStatus(){
        String angkatan = "";
        String jurusan = ""; 
        angkatan = "20" + NIM.substring(0,2);
 
        switch(NIM.substring(6,7)){
        case "2":
            jurusan = "Teknik Meniup Gelembung";
        break ; 
        case "3": 
            jurusan = "Teknik Berburu UburUbur";
        break ;
        case "4": 
            jurusan = "Sistem Perhamburgeran";
        break ;
        case "6": 
            jurusan = "Pendidikan Chum Bucket";
        break ;
        case "7": 
            jurusan = "Teknologi Telepon Kerangr";
        break ;
        }
        return jurusan + "," + angkatan ; 
    }
 
    public double getBeasiswa(){
        double beasiswa;
        if (IPK >= 3.0 && IPK <=3.5 ){
            beasiswa = 50 ; 
        }else if (IPK > 3.5 && IPK <= 4){
            beasiswa = 75;
        }else {
            beasiswa = 0 ;
        }
        return beasiswa ; 
    }
 
    public String toString(){
       
        System.out.println("Nama\t\t : " + this.getNama());
        System.out.println("NIK\t\t : " + this.getNIK());
        System.out.println("Jenis Kelamin\t : " + (this.getJenisKelamin()? "Laki-laki" : "Perempuan"));
        System.out.println("Pendapatan\t : " +(this.getBeasiswa()+ this.getTunjangan()) + "$");
        
        System.out.println("NIM\t\t : " + this.getNIM());
        System.out.println("IPK\t\t : " + this.getIPK());
        System.out.println("Status\t\t : " + this.getStatus());
        return "" ; 
    } 

}
