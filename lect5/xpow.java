//two integers are given x and n , calculate the value of x to the power n using recursion

public class xpow{

    static int power(int x , int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);

    }
    public static void main(String[] args){
        int x=2;
        int n=3;
        //power(x,n);
        System.out.println(power(x,n));


    }
}