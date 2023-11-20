import java.util.List;
import java.util.Scanner;

public class ParcelDelivery {
    private static boolean parcelIsValid(boolean isInternational, int parcelWeight) {
        // Returns whether a given parcel is valid
        if (isInternational && parcelWeight > 5) {
            return false;
        }
        return true;
    }

    private static int calculatePrice(boolean isInternational, int parcelWeight) {
        // Returns the price of a given parcel
        int basePrice, additionalPricePerKg;
        int basePriceLimit = 5;
        if (isInternational) {
            basePrice = 40;
            additionalPricePerKg = 0;
        } else {
            basePrice = 20;
            additionalPricePerKg = 1;
        }

        int parcelPrice = basePrice;
        if (parcelWeight > basePriceLimit) {
            parcelPrice += (parcelWeight - basePriceLimit) * additionalPricePerKg;
        }
        return parcelPrice;
    }

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        final List<String> positiveResponses = List.of("yes", "y");

        System.out.println("Is the parcel international? (y/n)");
        String internationalInput = scanner.nextLine();
        boolean isInternational = positiveResponses.contains(internationalInput.toLowerCase());

        System.out.println("Enter weight of parcel:");
        int parcelWeight = scanner.nextInt();

        // Check if parcel is valid
        if (!parcelIsValid(isInternational, parcelWeight)) {
            System.out.println("Rejected");
            return;
        }

        // Output price
        int price = calculatePrice(isInternational, parcelWeight);
        System.out.println("Your price is: $" + price);
    }
}