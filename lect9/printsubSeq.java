//backtracking -> pick a point explore it and it meets the required condition return else explore more

//a array is given print the sub sequence which has the same value as k
//check sum of all the possible sum which has the same value as k using recursion

public class printsubSeq{
    static void print(int[] arr , int i , int sum , int k , int[]ans , int size){
        if (i == arr.length) {
            if (sum == k) {
                for(int j=0 ; j<size ; j++){
                             System.out.println(ans[j]+" ");
                }
                System.out.println();
            }
            return;
        }
        ans[size] = arr[i];

        //include 
        print(arr, i+1, sum+arr[i] ,k,ans,size+1);

        //exclude
        print(arr,i+1,sum,k,ans,size);
    }

    public static void main(String[] agrs){
        int[] arr = {1,2,1};
        int k = 2;
        int i = 0;
        int sum = 0;
        int[] ans = new int[arr.length];
        int size = 0;
        print(arr,i,sum,k,ans,size);
    }
}
// import java.util.*;

// public class printsubSeq {

//     public static void printSubseqK(int[] arr, int index, List<Integer> current, int sum, int k) {
//         // Base case
//         if (index == arr.length) {
//             if (sum == k) {
//                 System.out.println(current);
//             }
//             return;
//         }

//         // Take the element
//         current.add(arr[index]);
//         printSubseqK(arr, index + 1, current, sum + arr[index], k);

//         // Backtrack
//         current.remove(current.size() - 1);

//         // Not take the element
//         printSubseqK(arr, index + 1, current, sum, k);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 1};
//         int k = 2;

//         printSubseqK(arr, 0, new ArrayList<>(), 0, k);
//     }
// }

