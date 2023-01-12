package ransom_note;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String ransomNote = "bb", magazine = "bbbsa";
        System.out.println((canConstruct(ransomNote, magazine)));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        Arrays.sort(ransomArray);
        Arrays.sort(magazineArray);
        int n1 = ransomArray.length;
        int n2 = magazineArray.length;

        if (n1 > n2)
            return false;

        int r_pointer = 0;
        int m_pointer = 0;
        while (m_pointer < magazine.length()) {
            if (ransomArray[r_pointer] == magazineArray[m_pointer])
                r_pointer++;
            if (r_pointer == ransomArray.length)
                return true;
            m_pointer++;
        }
        return false;
    }
}
