package Array;

public class OneDimensionalArrayExample {
    public static void main(String[] args) {
        // 1D Array
        
        int rollNumbes[] = new int[4];

        // rollNumbes[0] = 101;
        // rollNumbes[1] = 102;
        // rollNumbes[2] = 103;
        // rollNumbes[3] = 104;

        // System.out.println("Roll Numbers : " + rollNumbes[0]);
            
        int x = 101;
        for (int i = 0; i < rollNumbes.length; i++) {
            rollNumbes[i] = x;
            x++;
        }

        for (int i = 0; i < rollNumbes.length; i++) {
            System.out.println(rollNumbes[i]);
        }
    }
}
