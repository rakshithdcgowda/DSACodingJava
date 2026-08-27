package JavaConcepts;

public class Stringsconcepts {
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        
        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Character at a specific index
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);
        
        // Substring
        String substr = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substr);
        
        // Concatenation
        String newStr = str.concat(" How are you?");
        System.out.println("Concatenated String: " + newStr);
        
        // Replace
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
        
        // Split
        String[] parts = str.split(", ");
        System.out.println("Split parts: ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
