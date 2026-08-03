package InterviewCoding;

public class Permutations {

    public static void main(String[] args){
         String str= "abcd";
         //output:- a, ab, abc, abcd, b, bc, bcd, c, cd, d

         for (int i=0; i<str.length();i++)
         {
            for(int j=i; j<str.length();j++)
            {
               System.out.print(str.substring(i,j+1)+" ,");
            }
         }
    }
}
