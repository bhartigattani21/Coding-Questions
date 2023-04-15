public class problem9 {
    public static int fun(int n) {
        if (n==0) {
            return 1;
        }
         int fn = fun(n-1);
        int fc =2*fn;
         
        return fc;
        
    }

    public static int opti(int x ,int n){

        if (n==0) {
            return 1;
            
        }
        int fc =opti(x ,n/2) ;
       int fc2 = fc *fc;
        if (n%2!=0) {
            return x *fc2;
            
        }
        return fc2;
    }
    public static void main(String[] args) {
        int n =10;
       
        
        // System.out.println(fun(n)); 
        System.out.println(opti(2, n)); 
    }
}
