package factory.impl;

import factory.interfaces.TransportFactory;
import transport.impl.aircraft.AN225;
import transport.impl.car.Niva;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class UkrainianFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft creareAircraft() {
        return new AN225();
    }
}
