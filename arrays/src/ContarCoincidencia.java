import java.util.Scanner;

public class ContarCoincidencia {
    public static void main(String[] args) {
        /*Ejercicio 9: Contar coincidencias en un Array:
Crea un programa que mire dentro de un array, si hay elementos
repetidos y los cuente e imprima en pantalla en orden del elemento
que más se repite al que menos.*/



        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int nElementsArray = entrada.nextInt();
        char [] array = new char[nElementsArray];

        for (char i=0;i< nElementsArray;i++){
            System.out.println("Ingrese el caracter");
            array[i] = entrada.next().charAt(0);
        }
        int count1 =0;
        int count2 =0;
        int count3 =0;
        int count4 =0;
        int count5 =0;
        for(char i=0;i<array.length;i++){
            if(array[i] == array[0]){
                count1++;
            }
            if(array[i] == array[1]){
                count2++;
            }
            if(array[i] == array[2]){
                count3++;
            }
            if(array[i] == array[3]){
                count4++;
            }
            if(array[i] == array[4]){
                count5++;
            }
        }
        System.out.println("elemento 1 se repite "+count1);
        System.out.println("elemento 2 se repite "+count2);
        System.out.println("elemento 3 se repite "+count3);
        System.out.println("elemento 4 se repite "+count4);
        System.out.println("elemento 5 se repite "+count5);




    }
}
