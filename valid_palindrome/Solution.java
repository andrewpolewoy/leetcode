package valid_palindrome;



/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class Solution {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(isPalindrome(s1)); // true
        System.out.println(isPalindrome(s2)); // false
        System.out.println(isPalindrome(s3)); // true
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = s.length() -1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
//Input
//        s =
//        "race a car"
//Output
//false