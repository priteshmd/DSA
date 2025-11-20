class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;

        while (x > revertedNumber) {
            // Get the last digit of x and append it to revertedNumber.
            revertedNumber = revertedNumber * 10 + (x % 10);
            
            // Remove the last digit from x.
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}

