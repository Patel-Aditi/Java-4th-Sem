public class nonrepeating{
    public static void main(String[] args){
        String str1 = "aabcddd";
        //int count = 1;
       // int result = "";
        for(int i=0;i<str1.length();i++){
          int  count=0;

        for(int j=0;j<str1.length();j++){
        if(str1.charAt(i)==str1.charAt(j)){
             count++;
            }
        } 
        if(count==1){
            System.out.println(str1.charAt(i));
            break;
        }
      }
    } 
}