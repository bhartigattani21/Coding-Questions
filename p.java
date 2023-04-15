// public class p{

//     public static void decreasing(int n,int i){
        
//         if (i==n) {

//              System.out.println(n);
//              return;
//         }
//          System.out.print(i +" ");
         
//          decreasing(n,i+1);
//     }
//     public static void main(String[] args) {
//         int n=10;
//         int i =1;
//         decreasing(n,i);
//     }
// }

public class p{

    public static void decreasing(int n){
        
        if (n==1) {

             System.out.print(n + " ");
             return;
        }
        decreasing(n-1);
         System.out.print(n +" ");
         
         
    }
    public static void main(String[] args) {
        int n=10;
        
        decreasing(n);
    }
}
