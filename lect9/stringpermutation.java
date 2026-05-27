//a string is given find all the peremutations of it

 public class stringpermutation{

    static void permute(char[] arr,int i){
        if(i==arr.length){
            System.out.println(new String(arr));
            return;
        }

        for(int j=i ; j<arr.length ; j++){
            swap(arr,i,j);
            permute(arr,i+1);
            swap(arr,i,j);
        }
    }

    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        String str = "abc";
        permute(str.toCharArray(),0);
    }
 }