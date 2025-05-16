public class Harris {
    public static void main(String[] args) {
        int result = getTheSmallest(3, 13, 5);
        System.out.println(result);
    }

    public static int getTheSmallest(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            System.out.println("a is smaller");
            return a;
        } else if ((b < a) && (b < c)) {
            System.out.println("b is smaller");
            return b;
        } else {
            System.out.println("c is smaller");
            return c;
        }
    }
}