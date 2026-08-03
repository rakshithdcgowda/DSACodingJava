package Programming;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheDuplicateCharactersInAString {
    
    public static void main(String[] args)
    {
        //inpuyt str = "Automation";
        //output = "a,o,t" -> Duplicate characters are: a, o, t
        String str = "Automation";
        findDuplicateCharacters(str);

    }

    public static void findDuplicateCharacters(String str)
    {
         char[] charArray = str.toCharArray();

         //-----appraoch 1 - Brute force approach -> O(n^2) time complexity
         // O(n^2) time complexity
        // for(int i=0;i<charArray.length;i++)
        // {
        //     for(int j=i+1;j<charArray.length;j++)
        //     {
        //         if(charArray[i]==charArray[j])
        //         {
        //             System.out.println("Duplicate character is: "+charArray[j]);
        //         }
        //     }
        // }



        // -----appraoch 2 - Using HashSet -> O(n) time complexity
        //  HashSet<Character> set = new HashSet<>();
        //  HashSet<Character> duplicates = new HashSet<>();
        //  for(char ch : charArray)
        //  {
        //     char c = Character.toLowerCase(ch);
        //      if(!set.add(c))
        //      {
        //          duplicates.add(c);
        //      }
        //  }
        //  System.out.println("Duplicate characters are: "+duplicates);



        // -----appraoch 3 - Using LinkedHashMap -> O(n) time complexity
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

    }
}
