public class problem12 {
    public static void fun(String s,int idx , StringBuilder newstr , boolean [] map){
        if (idx == s.length()) {
            System.out.println(newstr);
            return;
        }
        char CurrChar = s.charAt(idx);
        if (map[CurrChar - 'a']==true) {
            fun( s, idx+1 , newstr , map);
        }
        else{ 
            map[CurrChar - 'a']=true;
            fun( s, idx+1 , newstr.append(CurrChar) , map);

        }
    }
    public static void main(String[] args) {
        String s = "apnacollage";
        fun(s,0, new StringBuilder(""),new boolean [26]  );
    }
    
}







