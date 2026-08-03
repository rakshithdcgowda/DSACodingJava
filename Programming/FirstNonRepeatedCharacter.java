package Programming;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args)
    {
        //input str = "Automation";
        //output = "u" -> First Non-Repeated character is: u
        String str = "Automation";
        FirstNonRepeatedCharacter(str);
    }

    public static void FirstNonRepeatedCharacter(String str)
    {
        str = str.toLowerCase();
        // O(n^2) time complexity -> Brute force approach
        // for(int i=0;i<str.length();i++)
        // {
        //     boolean isDuplicate = false;
        //     for(int j=i+1;j<str.length();j++)
        //     {
        //         if(str.charAt(i)==str.charAt(j))
        //         {
        //             isDuplicate = true;
        //         }
        //     }
        //     if(!isDuplicate)
        //     {
        //         System.out.println("First Non-Repeated character is: "+str.charAt(i));
        //         break;
        //     }
        // }


        // O(n) time complexity -> Best approach
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("First Non-Repeated character is: "+entry.getKey());
                break;
            }
        }
    }
    
}
