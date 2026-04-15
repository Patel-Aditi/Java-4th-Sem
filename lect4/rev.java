// take a string and reverse it using recursion

// public class rev{
//     static void reverse(String str){
//         if(str.lenght()==0){
//             return;
//         }
//         System.out.println(str.charAt(str.length()-1));
//         reverse(str.substring(0.str.length()-1));
//         // System.out.println(n);
//         // printnumber(n-1);
//     }
//     public static void main(String[] args) {
//         String str="hello";
//         reverse(str);
//         // String result= reverse(str);
//         // System.out.println(result);
//     }
// }


public class rev {

    static void reverse(String str){
        if(str.length() == 0)
            return;

        System.out.print(str.charAt(str.length()-1));
        reverse(str.substring(0, str.length()-1));
    }

    public static void main(String[] args) {
        String str = "hello";
        reverse(str);
    }
}