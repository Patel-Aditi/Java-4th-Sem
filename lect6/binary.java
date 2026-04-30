//wap to make binary no.

public class binary{
    static int binaryConvert(String str,int n){
        if(n==0){
            System.out.println(str);
            return 0;
        }
        binaryConvert(str+"0",n-1);
        binaryConvert(str+"1",n-1);
        return 0;

    }


    public static void main(String[] args) {
        int n=2;
        binaryConvert("",n);
        
    }
}