import java.util.*;
public class DescendSort {
    public static void main(String[] args) {
        Integer []arr= {4,6,3,7,8};
        Arrays.sort(arr,(a,b)->Integer.compare(b,a));
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,Comparator.reverseOrder());
        // Arrays.sort(arr,(a,b)->b-a);
        // Arrays.sort(arr,(a,b)->Math.abs(7-a)-Math.abs(7-b)); sort from the particular distance
        for(int i : arr){
            System.out.print(i+" ");
        }
   }
}

//C++ Descending Sort Method
// #include <iostream>
// #include <vector>
// #include <algorithm>

// int main() {
//     std::vector<int> arr = {4, 8, 2, 9, 5};

//     // Use a lambda for the comparison logic
//     std::sort(arr.begin(), arr.end(), [](int a, int b) {
//         return a > b; // Sorts in descending order
//     });

//     return 0;
// }

