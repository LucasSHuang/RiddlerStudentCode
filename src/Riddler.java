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

        // TODO: Complete the decryptOne() function
        for (int i = 0; i < encrypted.length(); i++) {
            char letter = encrypted.charAt(i);
            int encryptedPositition =  letter - 'a';

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

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
