package InterviewCoding;

public class LongestSubstring {

    public static void main(String[] args) {
        String str = "abcdeamnopqnxat";
            String longestSubstring = lengthOfLongestSubstring(str);
            System.out.println("Longest substring: " + longestSubstring + " with length: " + longestSubstring.length());
    }

    public static String lengthOfLongestSubstring(String s)
    {
        String substring = "";
        String longestSubstring = "";
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(substring.contains(Character.toString(ch)))
            {
                if(substring.length() > longestSubstring.length())
                {
                    longestSubstring = substring;
                }
                substring = substring.substring(substring.indexOf(ch)+1);
                substring += ch;
            }else
            {
                substring += ch;
            }    
        }
        return longestSubstring;
    }
}
