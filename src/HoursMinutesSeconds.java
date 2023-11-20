public class HoursMinutesSeconds {
    /*
     * Write a program that outputs the number of hours, minutes
     * and seconds that corresponds to 50,391 total seconds.
     * The output should be 13 hours, 59 minutes and 51 seconds.
     */
    public static void main(String[] args) {
        final int secondsInMinute = 60;
        final int minutesInHour = 60;

        int totalSeconds = 50391;

        int seconds = totalSeconds % secondsInMinute;
        int totalMinutes = totalSeconds / secondsInMinute;

        int minutes = totalMinutes % minutesInHour;
        int hours = totalMinutes / minutesInHour;

        System.out.printf("%d hours, %d minutes and %d seconds%n", seconds, minutes, hours);
    }
}