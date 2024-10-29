import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        // System.out.println("n = " + n);
        Set<Character> chars = new HashSet<Character>();

        int start = 0, end = 0;
        int ans = 0, temp = 0;
        while (end < n) {
            if (!chars.contains(s.charAt(end))) {
                chars.add(s.charAt(end));
                // System.out.println("added " + s.charAt(end) + " to chars.");

                // temp = end - start + 1;
            } else {
                while (chars.contains(s.charAt(end))) {
                    chars.remove(s.charAt(start));
                    // System.out.println("removed " + s.charAt(start) + " in chars.");
                    start++;
                    // temp--;
                }
                chars.add(s.charAt(end));
                // System.out.println("added " + s.charAt(end) + " to chars.");
            }
            temp = end - start + 1;
            // System.out.println("start = " + start);
            // System.out.println("end = " + end);
            // System.out.println("temp = " + temp + '\n');

            ans = (temp > ans) ? temp : ans;
            end++;
        }

        return ans;
    }
}