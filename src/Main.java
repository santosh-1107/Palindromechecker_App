class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        if (input == null || input.length() == 0) {
            return false;
        }

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}


class PalindromeCheckerApp {

    public static void main(String[] args) {

            String input = "racecar";

            PalindromeChecker checker = new PalindromeChecker();

            boolean result = checker.checkPalindrome(input);

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + result);
        }
    }