//given is a array , find the subsequence and count

public class count {

    static int count(int[] arr, int i, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        // include current element
        int left = count(arr, i + 1, sum + arr[i], k);

        // exclude current element
        int right = count(arr, i + 1, sum, k);

        return left + right;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        int result = count(arr, 0, 0, k);
        System.out.println(result);
    }
}