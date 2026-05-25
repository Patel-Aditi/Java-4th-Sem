//a array is given print the sum of the subsequence

public class subsequence{

    static void sumSubsequence(int arr[], int index, int sum) {

        // Base condition
        if(index == arr.length) {
            System.out.println(sum);
            return;
        }

        // Pick element
        sumSubsequence(arr, index + 1, sum + arr[index]);

        // Not pick element
        sumSubsequence(arr, index + 1, sum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        sumSubsequence(arr, 0, 0);
    }
}