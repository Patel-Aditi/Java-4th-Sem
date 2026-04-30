//wap to make the substring using double recursion

// public class Substring{
//     static int SubstringRecursion(String str,int n){
//         if(n==str.length()){
//             return 0;
//         }
//         for (int i = n+1; i <= str.length(); i++) {
//              System.out.println(str.substring(n,i));
            
//             }
//         return SubstringRecursion(str, n+1);
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         SubstringRecursion(str,0);
//     }
//  }
        


//2nd way
public class  Substring{
    static int Subset(String n, String up){
        if(up.isEmpty()){
            System.out.println(n);
            return 0;
        }
        char ch=up.charAt(0);

        //include
        Subset(n+ch,up.substring(1)); 

        //exclude
        Subset(n,up.substring(1)); 
        return 0;
    }
    

    public static void main(String[] args){
        String str="abc";
        Subset("",str);
    }
}



