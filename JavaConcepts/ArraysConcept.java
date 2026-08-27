package JavaConcepts;

import java.util.Arrays;

public class ArraysConcept {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int[] arr2 = {7,6,4,3,1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of 3: " + index);
        System.out.println(Arrays.equals(arr, arr2));

        int[] arr3 = Arrays.copyOf(arr, 7);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arr4));

    }
    
}
