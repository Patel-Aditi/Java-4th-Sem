//given is a string and a variable k , print  the substring the the size k
//eg. str=a,b,c k=2 , 
//o/p -> ab bc ac

public class recsubstring {

    static void printsub(String p, String up, int k) {
        if (p.length() == k) {
            System.out.println(p);
            return;
        }

        if (up.isEmpty()) return;

        char ch = up.charAt(0);

        // take character
        printsub(p + ch, up.substring(1), k);

        // skip character
        printsub(p, up.substring(1), k);
    }

    public static void main(String[] args) {
        String str = "abc";
        int k = 2;

        printsub("", str, k);
    }
}