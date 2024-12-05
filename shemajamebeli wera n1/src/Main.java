import java.util.Random;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        //1) b)-3
        // 2) c)
        // 3) d)
        // 4) c) String
        // 5) a) A
        // 6) c)
        // 7) a)
        //8) a)
        // 9) a)
        // 10 c)
        // 11 c)
        // 12 c)
        // 13 a)
        // 14 a)
        // 15 b)

        // 16
        int [] arr={1, 5, 9, 2, 10, 7};
        int min=arr[0];
        int minIndex=0;
        int maxIndex=arr[0];
        int max=arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                minIndex = i;
            }

            System.out.println("yvelaze iafi wigni aris am maRaziaSi " + minIndex + "fasi" + min);
            System.out.println("yvelaze dzviri wigni aris am maRaziaSi " + maxIndex + "fasi" + max);
        }
            //17
            for(int j=0; j<=100; j++) {
                if (j%5==0 && j%7==0) {
                    System.out.println("HEYHOW");
                }
               else  if (j%5==0 ) {
                    System.out.println("HEY");
                }
                else  if ( j%7==0) {
                    System.out.println("HOW");
                }
                else  {
                    System.out.println(j);
                }


            }
      //18
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(100);
            }
        }


        System.out.println("Generated Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] );
            }
            System.out.println();
        }


        int min1 = array[0][0];
        int max1 = array[0][0];
        int minRow = 0, minCol = 0;
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] < min1) {
                    min1 = array[i][j];
                    minRow = i;
                    minCol = j;
                }
                if (array[i][j] > max1) {
                    max1 = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Smallest element: " + min1 + " at (" + minRow + ", " + minCol + ")");
        System.out.println("Largest element: " + max1 + " at (" + maxRow + ", " + maxCol + ")");
        //19
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the size of the square array (n x n): ");
        int n = scanner.nextInt();
        int[][] array1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array1[i][j] = random.nextInt(50) + 1;
            }
        }
        System.out.println("Generated Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array1[i][j] );
            }
            System.out.println();
        }
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += array[i][i];
            diagonalSum += array[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            int centerIndex = n / 2;
            diagonalSum -= array[centerIndex][centerIndex];
        }
        System.out.println("Sum of both diagonals: " + diagonalSum);
        //20
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n1 = matrix.length;


        for (int i = 0; i < n1; i++) {
            for (int j = i; j < n1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1 / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n1 - 1 - j];
                matrix[i][n1 - 1 - j] = temp;
            }
        }


        System.out.println("Rotated Matrix (90 degrees clockwise):");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }



        }


    }
