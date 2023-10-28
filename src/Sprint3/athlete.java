package Sprint3;

public class athlete {
    public static void main(String[] args) {
        double hours;
        int distanceKm;
        double distanceMile;
        double speed;
        hours = 0.755;
        distanceKm = 14;
        distanceMile = distanceKm / 1.6;
        speed = distanceMile / hours;
        System.out.println("The athlete's speed is " + speed);
    }
}