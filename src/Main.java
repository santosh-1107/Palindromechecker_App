import java.util.Stack;
interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}


class PalindromeCheckerApp {

    public static void main(String[] args) {


            String input = "level";

            // Inject strategy at runtime
            PalindromeStrategy strategy = new StackStrategy();

            PalindromeService service = new PalindromeService(strategy);

            boolean result = service.execute(input);

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + result);
        }
    }