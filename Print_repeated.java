public class Print_repeated {
public static void repeated(String s) {
        int[] freq = new int[26];
        s = s.toLowerCase();
        int n = s.length();
        for(int i = 0; i < n; ++i){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;


            }
        }
        for(int i = 0; i < 26; ++i){
            if(freq[i] > 1){
                System.out.print((char)(i+'a'));
            }
        }
    }
        

    public static void main(String[] args) {
        String test = "madam teacher";
        repeated(test);
    }
}
