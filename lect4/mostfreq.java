//given a string , print the most freq char -> check the whole string not just adjacent 

public class mostfreq {
    public static void main(String[] args) {
        
        String str = "aabbbccddeee";
        
        int[] freq = new int[256];   // For ASCII characters
        
        // Count frequency
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }
        
        // Find max frequency
        int max = 0;
        char mostFreq = ' ';
        
        for(int i = 0; i < str.length(); i++){
            if(freq[str.charAt(i)] > max){
                max = freq[str.charAt(i)];
                mostFreq = str.charAt(i);
            }
        }
        
        System.out.println("Most frequent character: " + mostFreq);
        System.out.println("Frequency: " + max);
    }
}