import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move pointers
            left++;
            right--;
        }
    }
}

public class reversestring {
    public static void main(String[] args) {
        // Input string as character array
        char[] s = {'H', 'E', 'L', 'L', 'O'};

        // Print before reversing
        System.out.println("Before Reversing: " + new String(s));

        // Reverse the string
        Solution sol = new Solution();
        sol.reverseString(s);

        // Print after reversing
        System.out.println("After Reversing: " + new String(s));
    }
}
