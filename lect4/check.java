//give a string , return true if the string is of no. else return false

public class check{
    public static void main(String[] args) {
        String str = "12345";
        boolean isNum = true;
       
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                isNum = false;
                break;
            }
        }
        System.out.println(isNum);
    }
}