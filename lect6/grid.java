//given a grid , wap to count the no. of possible ways to move to last, it will be either left or right

public class grid{
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D", r-1, c);
        }
        if(c>1){
            path(p+"R", r, c-1);
        }
    }

    public static void main(String[] args){
        path("",3,3);
    }
}