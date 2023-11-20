import java.time.LocalDate;
import java.util.Scanner;

enum TicketType {
    none,
    small,
    large,
}

public class SpeedingTicket {
    /*
    You are driving a little too fast, and a police officer stops you to issue a speeding ticket.

    Write code to compute the result, encoded as an int variable: 0=no ticket, 1=small ticket, 2=big ticket.

    If your speed is 60 or less, the result is 0.
    If your speed is between 61 and 80 inclusive, the result is 1.
    If speed is 81 or more, the result is 2.
    However, if it is your birthday, encoded as a boolean, on that day, your speed can be 5 higher in all cases.

    speed = 70, birthday = false → 1
    speed = 65, birthday = false → 1
    speed  = 65, birthday = true → 0
     */
    final static int noTicketBaseLimit = 60;
    final static int smallTicketBaseLimit = 80;

    private static TicketType getTicket(int speed, LocalDate birthday) {
        LocalDate todayDate = LocalDate.now();
        int bonusSpeedLimit = todayDate.equals(birthday) ? 5 : 0;
        if (speed <= noTicketBaseLimit + bonusSpeedLimit) {
            return TicketType.none;
        } else if (speed <= smallTicketBaseLimit + bonusSpeedLimit) {
            return TicketType.small;
        } else {
            return TicketType.large;
        }
    }

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the speed:");
        int speed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your birthday (yyyy-mm-dd):");
        String birthdayInput = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(birthdayInput);

        // Get ticket
        TicketType ticketGiven = getTicket(speed, birthday);

        if (ticketGiven == TicketType.none) {
            System.out.println("No tickets given. Drive safely!");
        } else {
            System.out.printf("Ticket size: %s%n", ticketGiven);
        }
    }
}