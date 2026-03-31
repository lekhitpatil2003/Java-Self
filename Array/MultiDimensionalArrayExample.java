package Array;

public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        // Multi Dimensional Array

        // int [][] marks = new int[3][3];
        
        // marks[0][0] = 35;
        // marks[0][1] = 34;
        // marks[0][2] = 84;

        // marks[1][0] = 55;
        // marks[1][1] = 95;
        // marks[1][2] = 44;

        // marks[2][0] = 78;
        // marks[2][1] = 65;
        // marks[2][2] = 87;

        // // print array

        // for (int row = 0; row < marks.length; row++) {
        //     for (int col = 0; col < marks[row].length; col++) {
        //         System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        int[][] marks = new int[3][]; // rows = 3

        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];

        // Assigning Value
        marks[0][0] = 45;
        // marks[0][1] = 61;
        // marks[0][2] = 63;

        marks[1][0] = 51;
        marks[1][1] = 61;

        marks[2][0] = 62;
        marks[2][1] = 78;
        marks[2][2] = 78;
        // marks[2][3] = 69;
        
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
    }
}