record Bike(int gearSize) {
    public double getSpeed(int revolutionsPerMinute) {
        final int inchesPerMile = 5280;
        int revolutionsPerHour = revolutionsPerMinute * 60;
        double wheelCircumference = this.gearSize * Math.PI / 12d;
        return wheelCircumference * revolutionsPerHour / inchesPerMile;
    }
}

public class BikeSpeed {
    /*
     * The speed of a bicycle in miles per hour can be calculated using the following formula:
     *
     * Speed (mph) = Gear Size (inches) x 3.14 (Pi) x (1/12) x (1/5280) x Pedal Revolutions Per Minute (rpm) x 60
     *
     * Write a Java program to calculate the speed of a bike with a gear size of 100 inches and 90 rpm.
     *
     * Remember that the expression 1/12 will result in 0 as both 1 and 12 are integers, meaning the fractional part of
     * the result would be discarded - you may have to use other data types/equivalent values.
     */
    public static void main(String[] args) {
        Bike bike = new Bike(100);
        System.out.printf("Speed: %.2fmph%n", bike.getSpeed(90));
    }
}