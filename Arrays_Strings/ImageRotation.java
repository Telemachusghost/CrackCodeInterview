/*
So there are floor(N/2) cycles present in the 
image so we need to rotate these cycles

This was taken from geeksforgeeks.org
*/

public class ImageRotation {
    public static void main(String[] args) {
        int mat[][] = 
        {
          {1, 2, 3, 4},
          {5, 6, 7, 8},
          {9, 10, 11, 12},
          {13, 14, 15, 16}  
        };
        int n = 4;
        displayMatrix(4, mat);
        rotate90(mat, n);
        displayMatrix(4, mat);
    }

    public static void rotate90(int mat[][], int N) {
        for (int x = 0; x < N / 2; x++)
        {
            for (int y = x; y < N-x-1; y++) {
                
                // Puts top into temp
                int temp = mat[x][y];
                
                // Move right to top
                mat[x][y] = mat[y][N-x-1];
                
                // Move bottom to right
                mat[y][N-1-x] = mat[N-x-1][N-1-y];
                
                // Left to bottom
                mat[N-y-1][N-x-1] = mat[N-1-y][x];


                // bottom equal temp
                mat[N-y-1][x] = temp;
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