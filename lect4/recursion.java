//basic recursion code for printing no.
public class recursion{
    static void printnumber(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        printnumber(n+1);
    }
    public static void main(String[] args) {
        printnumber(1);
    }
}