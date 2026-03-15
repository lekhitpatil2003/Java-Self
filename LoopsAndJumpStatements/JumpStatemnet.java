package LoopsAndJumpStatements;

public class JumpStatemnet {
    public static void main(String[] args) {
        // whetehr a number is prime or not
        // int p = 9;
        // int i;
        // for (i = 1; i < p ; i++) {
        //     if (p % i == 0) {
        //         System.out.println("The number is not prime...");
        //     }
        // }
        // if (i == p){
        //     System.out.println("The number is prime.");
        // }

        // for (int i = 1; i <= 10; i++){
        //     if (i % 2 == 0) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // Brake in Nested loops
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");

                if (j >= 5) {
                    break;
                }
            }
            System.out.println();
        }
    }
}