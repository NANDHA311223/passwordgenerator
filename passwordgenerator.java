package cognifyz;

import java.util.Scanner;
import java.util.Random;

public class passwordgenerator {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the desired length of the password:");
	        int length = scanner.nextInt();

	        System.out.println("Include numbers? (yes/no):");
	        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

	        System.out.println("Include lowercase letters? (yes/no):");
	        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

	        System.out.println("Include uppercase letters? (yes/no):");
	        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

	        System.out.println("Include special characters? (yes/no):");
	        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

	        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecialChars);
	        System.out.println("Generated password: " + password);

	        scanner.close();
	    }

	    public static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecialChars) {
	        String numbers = "0123456789";
	        String lowercase = "abcdefghijklmnopqrstuvwxyz";
	        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";

	        StringBuilder validChars = new StringBuilder();
	        if (includeNumbers) validChars.append(numbers);
	        if (includeLowercase) validChars.append(lowercase);
	        if (includeUppercase) validChars.append(uppercase);
	        if (includeSpecialChars) validChars.append(specialChars);

	        Random random = new Random();
	        StringBuilder password = new StringBuilder();
	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(validChars.length());
	            password.append(validChars.charAt(randomIndex));
	        }

	        return password.toString();
	    }
}
