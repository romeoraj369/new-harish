
public class Simple {
    public static void main(String[]args){
        int result = getTheSmallest(34,56,78);
        System.out.println(result);


    }
    public static int getTheSmallest(int a,int b, int c){
        return Math.min(a,Math.min(b,c));
    }
}
