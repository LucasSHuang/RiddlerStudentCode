/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        int shift = 9;
        // TODO: Complete the decryptOne() function
        for (int i = 0; i < encrypted.length(); i++) {
            char letter = encrypted.charAt(i);
            if (Character.isUpperCase(letter)) {
                char decrypt = (char) ((letter - shift - 'A') % 26 + 'A');
                decrypted += decrypt;
            }
            else if (Character.isLowerCase(letter)) {
                char decrypt = (char) ((letter - shift - 'a') % 26 + 'a');
                decrypted += decrypt;
            }
            else {
                decrypted += letter;
            }
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
        while (!encrypted.isBlank()) {
            String part = encrypted.substring(0, 9);

        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
