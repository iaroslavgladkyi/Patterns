package factory.interfaces;


import transport.interfaces.Aircraft;
import transport.interfaces.Car;

// transport factory
public interface TransportFactory {

    //   what factory will produce

    Car createCar(); //cars

    Aircraft creareAircraft(); //aircrafts

}
