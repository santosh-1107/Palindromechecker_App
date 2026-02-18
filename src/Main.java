class PalindromeChecker_App {

    static final String APP_NAME = "PalindromeChecker_App";
    static final String VERSION = "Version 1.0";


    public static void main(String[] args) {

        String word = "madam";

        System.out.println("Palindrome Checker App - UC2");
        System.out.println("---------------------------------");
        System.out.println("Given Word: " + word);


        boolean isPalindrome = true;


        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("Result: The given word is a Palindrome.");
        } else {
            System.out.println("Result: The given word is NOT a Palindrome.");
        }

        System.out.println("\nProgram executed successfully.");
    }
}