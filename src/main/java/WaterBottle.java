public class WaterBottle {

    private double volume = 100.00;


    public WaterBottle(double volume) {
        this.volume = volume;
    }


    public double getVolume() {
        return volume;
    }

    public double drink() {
        return volume -= 10.00;
    }

    public double empty() {
        return volume = 0;
    }

    public double fill() {
        return volume = 100;
    }

}
