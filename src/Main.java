/*
 * UseCase1: Application Entry & Welcome Message
 * Palindrome Checker App
 * Version: 1.0
 */

class PalindromeChecker_App {

    // Application constants
    static final String APP_NAME = "PalindromeChecker_App";
    static final String VERSION = "Version 1.0";

    // Main Method - Entry point of the application
    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("=====================================");
        System.out.println("       " + APP_NAME);
        System.out.println("       " + VERSION);
        System.out.println("=====================================");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("This application will check whether a given string is a palindrome.");
        System.out.println("=====================================");

        // End of UC1
        System.out.println("system initialized successfully");
    }
}
