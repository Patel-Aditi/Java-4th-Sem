//count the occurence of letters
//not correct

public class compress {
    public static void main(String[] args) {
        
        String str1 = "aabbccccd";
        String count=1;
        String result=""; 

       for(int i=0;i<str1.length()-1;i++){
        if(str1.charAt(i)==str1.charAt(i+1)){
             count++;
        }
        else{
            result=result+str1.charAt(i)+count;
            count=1;
        }
     }
      result=result+str1.charAt(str1.length()-1)+count;

        // for(int j = 0; j < ch.length(); j++) {
        //     if(ch(i)==ch(j)) {
        //         int result= "";
        //         count++;
        //     }
        // }

        System.out.println(result);
      //  System.out.println(count);
    }
}