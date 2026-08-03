package Programming;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String str = "Automation";
        removeDuplicateCharactersInString(str);

    }
    
    public static void removeDuplicateCharactersInString(String str)
    {
        // O(n) time complexity -> Brute force approach
        str = str.toLowerCase();
        // String output = "";
        // for(int i=0;i<str.length();i++)
        // {
        //     char ch = str.charAt(i);
        //     if(output.indexOf(ch)==-1)
        //     {
        //         output += ch;
        //     }
        // }
        // System.out.println(output);


        // O(n) time complexity -> Using LinkedHashMap
        Set<Character> seen = new HashSet<>();
        StringBuilder output = new StringBuilder();

        for (char ch : str.toCharArray()) {

            char lower = Character.toLowerCase(ch);

            if (seen.add(lower)) {
                output.append(ch);
            }
        }

        System.out.println(output);
    }
}
