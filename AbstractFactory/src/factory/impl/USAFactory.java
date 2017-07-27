package factory.impl;

import factory.interfaces.TransportFactory;
import transport.impl.aircraft.Boeing747;
import transport.impl.car.Ford;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class USAFactory implements TransportFactory{
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Aircraft creareAircraft() {
        return new Boeing747();
    }
}
