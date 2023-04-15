// public class problem6 {

//     public static boolean sorting(int arr[] ,int i){
//         if (i==arr.length-1) {
//             return true;
//         } 
//           if (arr[i]>arr[i+1]) {
//             return false;
//           } 
        
//          return sorting(arr, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         System.out.print(sorting(arr, 0));
//     }
// }

public class problem6 {
    public static  int check(int arr[]) {
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i]>arr[i+1]) {
            return 0;
            
        } 
        }
       
        return 1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(check(arr));
    }
}