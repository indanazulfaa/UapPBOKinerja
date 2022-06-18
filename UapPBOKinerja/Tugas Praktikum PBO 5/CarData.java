package TugasPraktikum05;

import java.util.ArrayList;

public class CarData {
    static ArrayList <Car> carList = new ArrayList<Car>();
 
    public void addCar(String carType, String polNum, String merk){
    carList.add(new Car(carType, polNum, merk, true) ); 
    }
 
    public void listOfCar(){
        System.out.println("-------------------------------------");
        System.out.println(" DAFTAR MOBIL                        ");
        System.out.println("-------------------------------------");
        for(Car elemen : carList){
            System.out.println("TIPE MOBIL : " + elemen.getCarType());
            System.out.println("NO. POLISI : " + elemen.getPolNum());
            System.out.println("MERK MOBIL : " + elemen.getMerk());
            System.out.println("-------------------------------------");
         }
        System.out.println("");
    }
}
