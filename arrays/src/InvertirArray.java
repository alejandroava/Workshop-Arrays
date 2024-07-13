import java.util.Scanner;

public class InvertirArray {
    public static void main(String[] args) {
        /*Ejercicio 10: Invertir un Array
Escribe un programa en Java que invierta el orden de los elementos
en un array de números enteros.(Sin métodos)*/
        int newArray[] = new  int [10];
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i=0;i<numbers.length;i++) {
            newArray[i]= numbers[numbers.length -1 - i];

        }
        System.out.println("Array original");
        for(int j:numbers){
            System.out.println(j);
        }
        System.out.println("Array invertido");
        for (int i:newArray){
            System.out.println(i);
        }


    }
}
