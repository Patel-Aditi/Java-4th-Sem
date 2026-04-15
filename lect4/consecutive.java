//given a string of letter -> remive the consecutive letter and print it

public class consecutive{
    public static void main(String[] args) {
        String str="aabbbcccdd";
        String result="";
        for(int i=0;i<str.length();i++){
            if(i==0||str.charAt(i)!=str.charAt(i-1)){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}





//other way
// public class consecutive{
//     public static void main(String[] args) {
//         String str="aabbbcccdd";
//         String result="";
//         result+=str.charAt(0);
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)!=str.charAt(i-1)){
//                 result+=str.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }
// }