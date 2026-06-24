import java.util.*;
public class CountingSort{
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        int max = 10;
        int[] count = new int[max];
        for(int i = 0; i < arr.length;i++) count[arr[i]]++;

        int idx = 0;
        for(int i = 1; i < count.length;i++){
            while(count[i] > 0){   
                arr[idx++] = i;
                count[i]--;
            }
        }
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
}