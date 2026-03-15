import java.util.Scanner;

public class PositiveNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive Number.");
        } else {
            System.out.println("Negative Number");
        }

        sc.close();
    }
}