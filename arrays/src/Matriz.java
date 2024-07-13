public class Matriz {
    public static void main(String[] args) {
        /*Ejercicio 7: Transposición de una Matriz
Crea un programa en Java que calcule la transpuesta de una matriz
(intercambiar filas por columnas).*/

        int[][] matrix ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int [][] transpuesta = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                transpuesta[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[0].length; j++) {
                System.out.print(transpuesta[i][j]);
            }
            System.out.println();
        }
    }
}
