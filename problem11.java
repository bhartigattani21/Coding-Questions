import java.util.function.IntFunction;

public class problem11 {
    public static int fun(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        System.out.print(fun(5));
    }
}
