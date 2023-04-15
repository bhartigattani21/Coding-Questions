// class q1{
//     public static void fun(int arr[],int key,int i)
//     {
//         if (i==arr.length) 
//         {
//             return;
//         }

//         if(arr[i]==key)
//         {
//            System.out.println(i);
//         }
//          fun(arr, key, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
//         int key =2;
//         int i=0;
//         // System.out.println(fun(arr, key, i));
//         fun(arr, key, i);
//     }
// }
class q1{
    public static int fun(int arr[],int key,int i)
    {
        if (i==arr.length) 
        {
            return 00000;
            
        }

        if(arr[i]==key)
        {
           System.out.println(i);
        }
         return fun(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key =2;
        int i=0;
        System.out.println(fun(arr, key, i));
        // fun(arr, key, i);
    }
}