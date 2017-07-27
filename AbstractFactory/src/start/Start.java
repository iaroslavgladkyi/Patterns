package start;

import factory.impl.USAFactory;
import factory.impl.UkrainianFactory;
import factory.interfaces.TransportFactory;
import transport.interfaces.Aircraft;

public class Start {

    private static TransportFactory transportFactory;

    public static void main(String[] args) {

        if (true) {
            transportFactory = new UkrainianFactory();
        } else {
            transportFactory = new USAFactory();
        }

        transportFactory.creareAircraft().flight();
        transportFactory.createCar().drive();
    }
}
