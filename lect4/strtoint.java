//take two strings and convert them to integer and multiply
public class strtoint{
    public static void main(String[] args) {
        String str1="10";
        String str2="5";
        int result;
        int n1=Integer.valueOf(str1);   //converts string to int
        int n2=Integer.valueOf(str2);
        result = n1*n2;
        System.out.println(result);
    }
}




//other way
// public class strtoint{
//     public static void main(String[] args) {
//         String str1="10";
//         String str2="5";
//         int n1=0;
//         int n2=0;
//         for(int i=0;i<str1.length();i++){
//             n1=n1*10+(str1.charAt(i)-'0');
//         }
//         for(int i=0;i<str2.length();i++){
//               n2=n2*10+(str2.charAt(i)-'0');
//         }
//         System.out.println(n1*n2);
//     }
// }