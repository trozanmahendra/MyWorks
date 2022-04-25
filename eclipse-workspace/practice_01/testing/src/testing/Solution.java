package testing;

public class Solution {
    /**
     * @param s: input string
     * @return: longest pali substring     
     */
    //Enumeration
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }    
        int start = 0;
        int len = 0;
        int longestSub = 0;
        for (int i = 0; i < s.length(); i++) {//
            // Input:"abcdzdcab"
 
            //Odd case
            len = findLongestPalindromeFrom(s, i, i);
            if (len > longestSub) {
                longestSub = len;
                start = i - len / 2;
            }
            //Even case
            len = findLongestPalindromeFrom(s, i, i + 1);
            if (len > longestSub) {
                longestSub = len;
                start = i - len / 2 + 1;
            }
        }
        
        return s.substring(start, start + longestSub);
    }
    
    private int findLongestPalindromeFrom(String s, int left, int right) {
        int len = 0;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            len += left == right ? 1 : 2;
            left--;
            right++;
        }        
        return len;
    }     
    
    /*            
    dp[l][r] represents range [l, r] is a pali or not
    
    if s[l] == s[r] and s[l + 1 ~ r - 1] is pali, s[l ~ r] is pali
        
    O(n^2) time complexity and O(n^2) space complexity
    */
    //DP solution
    public String longestPalindromeDP(String s) {
        int len = s.length();
        boolean[][] isPalindrome = new boolean[len][len];
        int maxLen = 1;
        int start = 0;
                
        for (int i = 0; i < len; i++) {
            isPalindrome[i][i] = true;
        }
        for (int i = 0; i + 1 < len; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                maxLen = 2;
                start = i;
            }
        }
        for (int left = len - 1; left >= 0; left--) {
            for (int right = left + 2; right < len; right++) {
                if (isPalindrome[left + 1][right - 1] && s.charAt(left) == s.charAt(right)) {                    
                    isPalindrome[left][right] = true;                    
                    if (right - left + 1 > maxLen) {
                        maxLen = right - left + 1;
                        start = left;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }    
}