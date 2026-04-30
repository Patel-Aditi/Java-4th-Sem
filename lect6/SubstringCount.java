//wap to count the substring using recursion


// public class  SubstringCount{
//     static int Count(String n, String up){
//         if(up.isEmpty()){
//             return 1;
//         }
//         char ch=up.charAt(0);

//         //include
//         int left= Count(n+ch,up.substring(1)); 

//         //exclude
//         int right= Count(n,up.substring(1)); 
//         return left+right;
//     }
    

//     public static void main(String[] args){
//         String str="abc";
//         int result= Count("",str);
//         System.out.println(result);
//     }
// }



//2nd way
public class SubstringCount{

    static int count(String str){
        if(str.isEmpty()){
            return 1;
        }
        return count(str.substring(1)) + count(str.substring(1));
    }
    public static void main(String[] args) {
        String str= "abc";
        System.out.println(count(str)) ;
    }
}