//wap to find the sum of nummbers using recursion function

public class sum{

    static int SumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return n%10 + SumOfDigit(n/10);
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(SumOfDigit(n));
    }
}