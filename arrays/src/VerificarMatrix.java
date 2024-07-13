public class VerificarMatrix {
    public static void main(String[] args) {
        /*Ejercicio 8: Verificar Matriz Simétrica
Crea un programa en Java que verifique si una matriz cuadrada es
simétrica (igual a su transpuesta, Ejercicio 7).*/

        int[][] matrix ={
                {0, 1, -2},
                {1, 3, 0},
                {-2, 0, 5},
        };

        boolean simetrica = true;
        int i,j;
        i=0;
        while(i<3 && simetrica == true){
            j=0;
            while (j<i && simetrica == true){
                if(matrix[i][j] != matrix[j][i]){
                    simetrica = false;
            }
                j++;

            }
            i++;
        }

        if(simetrica == true){
            System.out.println("La matriz es simetrica");
        }else {
            System.out.println("La matriz no es simetrica");
        }


    }
}
