package transport.impl.aircraft;

import transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft{
    @Override
    public void flight() {
        System.out.println("Boeing747 flight!");
    }
}
