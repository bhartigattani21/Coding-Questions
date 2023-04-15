public class q3 {
    public static int fun(String str){

        if (str.length()==0) {
            return 0;
        }
           return fun(str.substring(1))+1;
           
    }
    public static void main(String[] args) {
        String str ="apnabhai";
        
       System.out.println( fun(str));
    }
}
