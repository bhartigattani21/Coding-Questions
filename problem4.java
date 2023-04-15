public class problem4{

    public static int sumof(int n){
        if (n==1) {
            return 1;
            
        }
        int Asum =  sumof(n-1);
        int sum =  n + sumof(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n =10;
        System.out.print(sumof(n));
    }
}