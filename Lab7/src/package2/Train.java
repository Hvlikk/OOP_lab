package package2;

public class Train implements Transport{

    @Override
    public Float salary(Float distance) {
        return distance/20;
    }
}
