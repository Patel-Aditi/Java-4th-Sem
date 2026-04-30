//wap to count head and tail during the toss
public class headtail{
    static int toss(String str,int n){
        if(n==0){
            System.out.println(str);
            return 0;
        }
        toss(str+"head ",n-1);
        toss(str+"tail ",n-1);
        return 0;

    }


    public static void main(String[] args) {
        int n=2;
        toss("",n);
        
    }
}