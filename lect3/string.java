public class string{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("hi");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str1.substring(0,2));
        System.out.println(str1.replace('l', 'z'));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.charAt(2));
        
       System.out.println(str1.equals(str2));
       System.out.println(str1.contains("world")); //contains that or not
       
       //reverse
       String rev = "";
       for(int i = str1.length()-1;i>=0;i--){
        rev = rev + str1.charAt(i);
       }
       System.out.println(rev);
    }
}