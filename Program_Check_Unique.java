public class Program_Check_Unique {
    public static boolean isUnique(String s) {
        int[] freq = new int[26];
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (freq[ch - 'a'] > 0) {
                    return false; // Duplicate found
                }
                freq[ch - 'a']++;
            }
        }

        return true; // All letters are unique
    }

    public static void main(String[] args) {
        String test = "madam teacher";
        if (isUnique(test)) {
            System.out.println("The string is a unique string.");
        } else {
            System.out.println("The string is NOT a unique string.");
        }
    }
}
