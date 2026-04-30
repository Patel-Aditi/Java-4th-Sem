//print the sequence of how we climb the stairs
public class countSteps {
    static void climb(String p, int n){
     if(n == 0){
        System.out.println(p);
            return;
        }
        if(n >= 1){
            climb(p + "1", n - 1);
        }
        if(n >= 2){
            climb(p + "2", n - 2);
        }
    }

    public static void main(String[] args){
        int n = 3;
        climb("", n);
    }
}