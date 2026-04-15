//find the factorial of any no. using recursion
public class recFact{
    static void factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    //    fact=fact*(n-1);

    }
    public static void main(String[] args) {
        int n=6;
        int ans=  factorial(n);
        System.out.println(ans);
    }
}