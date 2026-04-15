//make a string and remove the given char from it
public class removechar{
    public static void main(String[] args){
        String str="abcd";
        char remove = 'a';
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=remove){
                result += str.charAt(i);
            }
        //  System.out.println(result);
        }
        System.out.println(result);
    }
}