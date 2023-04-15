public class problem13 {
    public static int fun(int n){
        if (n == 1 || n==2) {
            return n;
        }
        return fun(n-1)+fun(n-2)*fun(n-1);
    }
    public static void main(String[] args) {
        int n =3;
        System.out.println(fun(n));

    }
}
