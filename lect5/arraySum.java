//given and array , find the sum of it using recursion

public class arraySum{

    static int SumOfArray(int[] arr,int n){
        if(n == arr.length){
            return 0;
        }
        return arr[n] + SumOfArray(arr, n+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n=0; 
        System.out.println(SumOfArray(arr ,n));
    }
}