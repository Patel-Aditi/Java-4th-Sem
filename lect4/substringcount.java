//wap to convert a string into a substring and count the one which has same first and last

public class substringcount{
    public static void main(String[] args) {
        String str = "abc";
        int count=0;
       // System.out.println(str.length());
        for(int i=0;i<str.length();i++){
           for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
             }         
            
        }
        System.out.println(count);
     }
         //System.out.println(str.substring(0,));
 }
