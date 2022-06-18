package TugasPraktikum05;

public class Main {
    
    public static void main(String[] args) {
    
    CarRider Yamaguchi = new CarRider("Hiro Yamaguchi",35,"082116871965");
    CarRider Thom = new CarRider("Thomas",28,"081564876651");
    CarRider Otest = new CarRider("Otest Kim ",32,"085674189734");
    CarRider Ayako = new CarRider("Putri Ayako",18,"089708654156");  
    
    CarData data = new CarData();
    data.addCar("CONVERTIBLE","P 2567 QY", "BMW M3");
    data.addCar("HATCHBACK","L 3087 BN", "Mini Countryman");
    data.addCar("MPV","W 1008 HG", "Toyota");
    data.addCar("VAN","N 5401 GG", "Alphard");
    
    data.listOfCar();
    RentArchive arsip = new RentArchive();
    arsip.Rent(Yamaguchi, data.carList.get(0), 10);
    arsip.Rent(Thom, data.carList.get(1), 5);
    arsip.Rent(Otest, data.carList.get(1), 8);
    arsip.Rent(Ayako, data.carList.get(2), 4);
    
    System.out.println("");
    arsip.info();
    }
}
