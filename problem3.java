public class problem3 {
    public static int fact(int n){
        if (n ==0) {
            return 1;
            
        }
        int fn =fact(n-1);
        int fc = n * fn;
        return fc;

    }
    public static void main(String[] args) {
        int n =5;
        System.out.print(fact(n));
    }
}
