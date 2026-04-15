//give a string of char and no. , check it find the max no. from it 

public class maxremove{
    public static void main(String[] args) {
        String str = "a5b3c5d9e2flz4";
        char max='0';
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9' && ch>max){
                max=ch;
            }
        }
        System.out.println(max);              
   }
}
