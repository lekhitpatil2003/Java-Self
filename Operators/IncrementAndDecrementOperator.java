public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        //Increment / Decrement Operator
        int x = 5;
        x++; // x = x + 1
        System.out.println("After x++: " + x); // Output: 6

        int y = 5;
        y--; // x = x - 1
        System.out.println("After x--: " + y); // Output: 4

        /* 
            pre and post increment
        */
        int j = 7;
        j++;   //postfix increment. output: 8
        ++j;    //prefix increment. output: 8
        
        System.out.println(j); 
        
        // j = 9

        int k = j++; // k = j, j = j + 1
        System.out.println(j + " , " + k); // j = 10, k = 9

        int l = ++j; // l = j + 1
        System.out.println(j + " , " + l); // j = 11, k = 11

        /* 
            pre and post Decrement
        */
        int m = 7;
        m--; // postfix Decrement. output: 6
        --m; // prefix Decrement. output: 6
        System.out.println(m); 
        
        // m = 5

        int n = m--; // n = m, m = m - 1
        System.out.println(m + " , " + n); // m = 4, n = 5

        int p = --m; // p = m - 1
        System.out.println(m + " , " + p); // m = 3, p = 3
    }
}
