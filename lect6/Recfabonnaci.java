//wap to make fabonnaci series using recursion

public class Recfabonnaci{

    static int FabonnaciSeries(int n){
        if(n==0||n==1){
            return n; 
        }
        return FabonnaciSeries(n-1)+FabonnaciSeries(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        //loop for printing the whole series
        for(int i=0;i<n;i++){
        System.out.println(FabonnaciSeries(i));
       }
    }

}