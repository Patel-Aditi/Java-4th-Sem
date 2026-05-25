//a array is given find its subsequence and check its sum is even or odd

public class arraysubseq{

    static int subseq(int[] arr,int i,int sum){
        if(i==arr.length){
            if(sum%2==0)
                System.out.println(sum+ " even");
            else
            System.out.println(sum+ " odd");
            return 0;
        }

        //take element
        subseq(arr,i+1,sum+arr[i]);

        //skip element
        subseq(arr,i+1,sum);
        return 0;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        subseq(arr,0,0);
    }
}