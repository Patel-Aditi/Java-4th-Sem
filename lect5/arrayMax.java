// //given an array find its max using reursion

// public class arrayMax{
//     static int MaxOfArray(int[] arr,int max){
//         if(max==arr.lenght){
//             return arr[0];
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,4,5,5};
//         int max=0;
//         System.out.println(MaxOfArray(arr,max));
//     }
// }


public class arrayMax {

    static int findMax(int arr[], int n) {
        
        // Base case
        if (n == 1)
            return arr[0];

        // Recursive case
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        
        int arr[] = {3, 9, 2, 15, 6};
        
        int max = findMax(arr, arr.length);
        
        System.out.println("Maximum element is: " + max);
    }
}