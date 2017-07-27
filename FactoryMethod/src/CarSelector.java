//car factory
public class CarSelector {

    private static CarSelector instance;

    private CarSelector(){

    }

    public static CarSelector getInstance() {
        if (instance == null) {
            instance = new CarSelector();
        }
        return instance;
    }

    //factory method that creates the required car
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType){
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case GRASS:
                car = new NewJeep();
                break;
        }
        return car;
    }
}
