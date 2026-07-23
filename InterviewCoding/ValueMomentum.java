package InterviewCoding;

import java.util.Arrays;

public class ValueMomentum {
    public static void main (String[] args) {
        // Move zero's in the array to right side and print the array
        //input arr={1,0,2,0,3,4,0,5,0,33,0}
        //output arr={1,2,3,4,5,33,0,0,0,0,0}
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5, 0, 33,0};
        int n = arr.length-1;
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]==0)
            {
                if(arr[n]==0)
                {
                    n--;
                    i--;
                }
                else
                {
                    int temp = arr[n];
                    arr[n]=arr[i];
                    arr[i]=temp;
                    n--;
                }
            }
        }

        System.out.println("Modified array is "+ Arrays.toString(arr));
        // Print the modified array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
