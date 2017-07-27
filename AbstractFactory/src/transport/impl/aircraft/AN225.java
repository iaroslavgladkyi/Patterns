package transport.impl.aircraft;

import transport.interfaces.Aircraft;

public class AN225 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("AN225 flight!");
    }
}
