//wap to count the no. of ways to climb the steps , at a time we can move 1step, or2, or3
public class step{
    static int ways(int n){
        if(n==0||n==1){
            return 1;
        }
        return ways(n-1)+ways(n-2);
    }

    public static void main(String[] args){
        int n=4;
        System.out.println(ways(n));
    }
}