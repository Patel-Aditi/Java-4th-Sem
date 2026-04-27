//wap to count the zeros in the given no.

public class zeroCount{

    static int CountZeros(int n){
        if(n==0){
            return 0;
        }
        int count = n%10;
        //return CountZeros(n/10);
        if(count == 0){
            return 1+CountZeros(n/10);
        }
        return CountZeros(n/10);
    }
    public static void main(String[] args) {
        int n=10200400;
        System.out.println(CountZeros(n));
    }
}