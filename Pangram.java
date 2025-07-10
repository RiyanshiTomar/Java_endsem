public class Pangram {
    public static  boolean isPangram(String s){
        int [] freq = new int[26];
        s = s.toLowerCase();
        int n = s.length();
        for(int i = 0; i < n; ++i){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;


            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                return false; // Letter missing
            }
        }

        return true; // All letters present
    }


    public static void main(String[] args) {
        String test = "The quick brown fox jumps over the lazy dog";

        if (isPangram(test)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is NOT a pangram.");
        }
    }
}








