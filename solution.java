import java.util.Arrays;

class PascalTriangle {
    public static int[][] generate(int numRows) {
      
        int[][] pascalTriangle = new int[numRows][];
 for (int i = 0; i < numRows; i++) {
          
            pascalTriangle[i] = new int[i + 1];    pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;
 for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }return pascalTriangle;
    } public static void main(String[] args) {
        int numRows = 5; 
  int[][] result = generate(numRows);
  for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
