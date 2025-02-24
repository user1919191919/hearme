import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password length (minimum 8): ");
        int length = scanner.nextInt();
        if (length < 8) {
            System.out.println("Password length should be at least 8 characters.");
            return;
        }

        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLower = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUpper = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include symbols? (y/n): ");
        boolean includeSymbols = scanner.next().equalsIgnoreCase("y");

        scanner.nextLine();
        System.out.print("Enter custom character set (or press Enter to skip): ");
        String customSet = scanner.nextLine();

        String password = generatePassword(length, includeLower, includeUpper, includeNumbers, includeSymbols, customSet);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    public static String generatePassword(int length, boolean includeLower, boolean includeUpper,
                                          boolean includeNumbers, boolean includeSymbols, String customSet) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        String charPool = "";

        if (!customSet.isEmpty()) {
            charPool = customSet;
        } else {
            if (includeLower) charPool += LOWERCASE;
            if (includeUpper) charPool += UPPERCASE;
            if (includeNumbers) charPool += NUMBERS;
            if (includeSymbols) charPool += SYMBOLS;
        }

        if (charPool.isEmpty()) {
            throw new IllegalArgumentException("No character set selected. Please enable at least one type.");
        }

        for (int i = 0; i < length; i++) {
            password.append(charPool.charAt(random.nextInt(charPool.length())));
        }

        return password.toString();
    }
}
