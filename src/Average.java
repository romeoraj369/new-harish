public class Average {
    public static void main(String[]args){
        int result =  getTheAverage(256,356,456);
        System.out.println(result);

    }
    public static int getTheAverage(int a, int b, int c){
        int average = (a+b+c)/2;
        return average;
    }

}
