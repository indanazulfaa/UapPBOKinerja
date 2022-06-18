package TugasPraktikum05;

import java.util.ArrayList;

public class RentArchive {
    static ArrayList <CarRent> rentData = new ArrayList<CarRent>();
    
    public void Rent(CarRider rider, Car car, int rentDur){
        if(car.getStatus()== true){
            System.out.println("Mobil berhasil disewa");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        }else{
            System.out.println("Maaf, mobil sudah disewa");
        } 
 }
    
    public void info(){
        System.out.println("-------------------------------------");
        System.out.println(" INFORMASI PELANGGAN                 ");
        System.out.println("-------------------------------------");

        for(int i = 0 ; i<rentData.size(); ++i){

            System.out.println("NAMA PEMINJAM \t: " + rentData.get(i).getRider().getName());
            System.out.println("TIPE MOBIL \t: " + rentData.get(i).getCar().getCarType());
            System.out.println("NO. POLISI \t: " + rentData.get(i).getCar().getPolNum());
            System.out.println("LAMA RENTAL \t: " + rentData.get(i).getRentDur());
            System.out.println("-------------------------------------");
        }
        System.out.println("");
    }


}
