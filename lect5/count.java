//wap to count the no. of digits using recursion

public class count{
    
    static int count =0;
    static int CountDigit(int n){
        if(n==0){
            return 0;
        }
       // count= n*count(n-1);
        return 1 + CountDigit(n/10);
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(CountDigit(n));
    }
}