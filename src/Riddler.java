/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Lucas Huang
 */

public class Riddler {
    // Constants
    private final int SHIFT = 9;
    private final int BINARY_LENGTH = 8;
    private final int DINGBAT_SHIFT = 9919;

    // Caesar shift +9
    public String decryptOne(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptOne() function
        // Loop through the message
        for (int i = 0; i < encrypted.length(); i++) {
            // Get every shifted letter
            char letter = encrypted.charAt(i);
            // If uppercase use 'A' to get proper ascii value
            if (Character.isUpperCase(letter)) {
                letter = (char) ((letter + SHIFT - 'A') % 26 + 'A');
            }
            // If lowercase use 'a' to get proper ascii value
            else if (Character.isLowerCase(letter)) {
                letter = (char) ((letter + SHIFT - 'a') % 26 + 'a');
            }
            // Keep spaces and punctuation the same
            decrypted += letter;
        }
        return decrypted;
    }

    // Ascii values
    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptTwo() function.
        // Make an array by splitting all the values by the spaces
        String[] asciiVals = encrypted.split(" ");
        // Loop through array
        for (int i = 0; i < asciiVals.length; i++) {
            // Turn values into ints
            int asciiVal = Integer.parseInt(asciiVals[i]);
            // Add to solution by converting back to char
            decrypted += (char) asciiVal;
        }
        return decrypted;
    }

    // Binary to text
    public String decryptThree(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptThree() function.
        // Loop through message
        for (int i = 0; i < encrypted.length(); i += BINARY_LENGTH) {
            // Get the 8 bit section every time
            String part = encrypted.substring(i, i + BINARY_LENGTH);
            // Apparently parseInt can help convert binary which is used here
            int asciiVal = Integer.parseInt(part, 2);
            decrypted += (char) asciiVal;
        }
        return decrypted;
    }

    // Caesar shift -9919
    public String decryptFour(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptFour() function.
        // Loop through message
        for (int i = 0; i < encrypted.length(); i++) {
            // Get every letter
            char letter = encrypted.charAt(i);
            // Shift by -9919
            letter = (char) (letter - DINGBAT_SHIFT);
            decrypted += letter;
        }
        return decrypted;
    }
}
