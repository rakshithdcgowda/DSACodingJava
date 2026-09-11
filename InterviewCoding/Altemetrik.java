package InterviewCoding;

public class Altemetrik {
    
    /*
    input = aA@Bb###cDD$d
    output = a2b2c1d3
    
    */

    public static void main(String[] args) {
        String input = "aA@Bb###cDD$d";
        String output = compressString(input);
        System.out.println("Compressed string: " + output);
    }

    public static String compressString(String s) {
        StringBuilder result = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        result.append(currentChar).append(count);
        return result.toString();
    }
}
