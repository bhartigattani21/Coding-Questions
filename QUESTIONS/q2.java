// class q2{
//     public static void fun(String arr[],int n){
      
//         if (n==0) {
//             return;
            
//         }

//         int lastdigit =n%10;
//         for (int i = 0; i < arr.length; i++) {
//             if (i==lastdigit) {
//                 fun(arr,n/10);
//                 System.out.print(arr[i] +" ");
                
//             }
//         }
          
         
            
        
//     }
//     public static void main(String[] args) {
//         String arr[]={ "zero","one","two","three","four","five","six","seven","eight","nine"};
//         int n=100000;
//         fun(arr,n);
//     }
// }
class q2{
    static String arr[]={ "zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void fun(String arr[],int n){
      
        if (n==0) {
            return;
            
        }

        int lastdigit =n%10;
        
             
                fun(arr,n/10);
                System.out.print(arr[lastdigit] +" ");
                
            
        }
          
         
            
        
    
    public static void main(String[] args) {
        int n=100000;
        fun(arr,n);
    }
}