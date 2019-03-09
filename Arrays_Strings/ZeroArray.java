/*
Sets a row and column of an element in a M X N matrix to zero 
if its a zero. I used the method of using two arrays 
*/

public class ZeroArray {
    public static void main(String[] args) {
        // Some test code
        int mat[][] = 
        {
          {1, 2, 3, 4},
          {0, 6, 7, 8},
          {9, 10, 11, 12},
          {13, 14, 0, 16}  
        };
        int n = 4;
        int m = 4;
        zeroFill(m, n, mat);
        displayMatrix(4, mat);

    }

    public static void zeroFill(int m, int n, int mat[][]) {
        boolean matMaskRow[] = new boolean[m];
        boolean matMaskCol[] = new boolean[n];
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (mat[x][y] == 0) {
                    
                    // Setting column to zero
                    if (matMaskRow[x] == true){continue;}
                    if (matMaskCol[y] == true){continue;}
                    
                    // Set column to zero
                    for (int i = 0; i < m; i++) {
                        mat[i][y] = 0;
                    }
                    
                    // Set row to zero
                    for (int i = 0; i < n; i++) {
                        mat[x][i] = 0;
                    }
                    matMaskRow[x] = true;
                    matMaskCol[y] = true;
                     
                }
                    
            }
        }
    }

    // Function to print the matrix 
    static void displayMatrix(int N, int mat[][]) 
      { 
          for (int i = 0; i < N; i++) 
          { 
              for (int j = 0; j < N; j++) 
                  System.out.print(" " + mat[i][j]); 
         
              System.out.print("\n"); 
          } 
          System.out.print("\n"); 
      } 
    }
