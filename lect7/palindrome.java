//give a string find the subsequence of string and check if any subsequence is palindrome or not 



// public class palindrome {

//     static void subseq(String p, String up) {

//         if (up.isEmpty()) {
//             if (!p.isEmpty() && isPalindrome(p)) {
//                 System.out.println(p);
//             }
//             return;
//         }

//         char ch = up.charAt(0);

//         // take character
//         subseq(p + ch, up.substring(1));

//         // skip character
//         subseq(p, up.substring(1));
//     }

//     static boolean isPalindrome(String str) {
//         int i = 0;
//         int j = str.length() - 1;

//         while (i < j) {
//             if (str.charAt(i) != str.charAt(j))
//                 return false;
//             i++;
//             j--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "aba";
//         subseq("", str);
//     }
// }



public class palindrome{

    static void subseq(String p, String up) {

        if (up.isEmpty()) {
            if (!p.isEmpty()) {
                String rev = new StringBuilder(p).reverse().toString();
                if (p.equals(rev)) {
                    System.out.println(p + " - Palindrome");
                } else {
                    System.out.println(p + " - Not Palindrome");
                }
            }
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    public static void main(String[] args) {
        String str = "aba";
        subseq("", str);
    }
}