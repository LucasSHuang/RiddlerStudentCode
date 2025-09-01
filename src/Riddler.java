/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Lucas Huang
 */

public class Riddler {
    private final int SHIFT = 9;
    private final int BINARY_LENGTH = 8;
    private final int DINGBAT_SHIFT = 9919;

    public String decryptOne(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptOne() function
        for (int i = 0; i < encrypted.length(); i++) {
            char letter = encrypted.charAt(i);
            if (Character.isUpperCase(letter)) {
                letter = (char) ((letter + SHIFT - 'A') % 26 + 'A');
            }
            else if (Character.isLowerCase(letter)) {
                letter = (char) ((letter + SHIFT - 'a') % 26 + 'a');
            }
            decrypted += letter;
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptTwo() function.
        String[] asciiVals = encrypted.split(" ");
        for (int i = 0; i < asciiVals.length; i++) {
            int asciiVal = Integer.parseInt(asciiVals[i]);
            decrypted += (char) asciiVal;
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptThree() function.
        for (int i = 0; i < encrypted.length(); i += BINARY_LENGTH) {
            String part = encrypted.substring(i, i + BINARY_LENGTH);
            int asciiVal = Integer.parseInt(part, 2);
            decrypted += (char) asciiVal;
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.
        for (int i = 0; i < encrypted.length(); i++) {
            char letter = encrypted.charAt(i);
            letter = (char) (letter - DINGBAT_SHIFT);
            decrypted += letter;
        }
        return decrypted;
    }
}
