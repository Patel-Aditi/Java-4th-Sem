//wap to reverse the no. using recursion function

public class rev {
    static int rev=0;
    static int reverse(int x){
        if(x == 0){
            return rev;
        }
        rev = rev * 10 + x % 10;
        return reverse(x/10);
    }

    public static void main(String[] args) {
        int x = 123;
      //  reverse(x);
        System.out.println(reverse(x));
    }
}