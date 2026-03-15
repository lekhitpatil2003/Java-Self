package LoopsAndJumpStatements;

public class JumpStatemnet {
    public static void main(String[] args) {
        // whetehr a number is prime or not
        int p = 7;

        for (int i = 1; i < p ; i++) {
            if (p % i == 0) {
                System.out.println("The number is not prime...");
            }
        }

    }
}
