//a string is given check weather we can divide it in two equal parts if yes-> true else -> false


public class StringEqual{

    static boolean check(String str, int i, String first, String second) {
        
        if(i == str.length()){
            return first.equals(second);
        }

        if(first.length() <= str.length()/2){
            if(check(str, i+1, first + str.charAt(i), second))
                return true;
        }

        if(second.length() <= str.length()/2){
            if(check(str, i+1, first, second + str.charAt(i)))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "abab";
        System.out.println(check(str, 0, "", ""));
    }
}