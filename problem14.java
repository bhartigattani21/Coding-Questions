public class problem14 {
    public static void fun(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;

        }
        fun(n - 1, 0, str + 0);
        if (lastplace == 0) {
            fun(n - 1, 1, str + 1);
        }
        // if (lastplace ==0) {
        // fun(n-1,0 , str.append("0"));
        // fun(n-1, 1, str.append("1"));
        // }
        // else{
        // fun(n-1,0 , str.append("0"));
        // }
    }

    public static void main(String[] args) {
        int n = 4;
        fun(n, 0, "");
    }
}
