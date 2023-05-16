package package2;

public class Airplane implements Transport{

    public Airplane(){};

    @Override
    public Float salary(Float distance) {
        return distance * distance/100;
    }
}
