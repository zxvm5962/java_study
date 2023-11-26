package java_frappe.problems.week3;

public class Week3_4 {
    public static void main(String[] args) {
        int[][] m1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] m2 = new int[][]{{7, 8}, {9, 10}, {11, 12}};
        final int ROW1 = m1.length;

        final int ROW2 = m2.length;
        final int COL2 = m2[0].length;

        int[][] m3 = new int[ROW1][COL2];

        for (int i = 0; i < ROW1; i++) {
            for (int j = 0; j < COL2; j++) {
                for (int k = 0; k < ROW2; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        for (int i = 0; i < ROW1; i++) {
            for (int j = 0; j < COL2; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }

}
