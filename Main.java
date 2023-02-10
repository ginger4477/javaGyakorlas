package org.example;

public class Main {

    /*
    Van egy verseny, ami tartalmaz versenyzőket
    Versenyzőknek van egy readonly név tulajdonsága
    Verseny ki tudja listázna a résztvevő versenyző mevét és helyezését

     */

    public static void main(String[] args) {

        Race race1 = new Race();
        Race race2 = new Race();
        race1.addDriver(new Driver("Pistike"));
        race1.addDriver(new Driver("Anikó"));
        race2.addDriver(new Driver("Józsi"));
        race2.addDriver(new Driver("Aranka"));
        race2.addDriver(new Driver("Zita"));

        race1.printDrivers();
        race2.printDrivers();

        /*
        Race.addDriver(new Driver("Pistike"));
        Race.addDriver(new Driver("Józsi"));
        Race.addDriver(new Driver("Marci"));

        Race.printDrivers();

         */
    }
}
