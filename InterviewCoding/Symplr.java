package InterviewCoding;

public class Symplr {

      public static void main(String[] args) {

     // String str="programming is fun";
      // Output = Prgrmmng S Fn
      String str = "programming is fun";
        String output = "";
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            char original = str.charAt(i);
            char ch = Character.toLowerCase(str.charAt(i));

            if(original==' ')
            {
              output += " ";
              flag = true;
            }
            else if(ch != 'a' && ch!='e' && ch!= 'i' && ch != 'o' && ch != 'u')
            {
              if(flag)
              {
                output += Character.toUpperCase(ch);
                flag = false;
              }else{
                output += ch;
              }
            }
        }

        System.out.println(output);

      //System.out.println("FinalOutput is : "+output);
    }
    
}
