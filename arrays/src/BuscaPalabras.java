import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaPalabras {
    public static void main(String[] args) {
        /*Ejercicio 5: Busca palabras.
Un programa que permita al usuario ingresar un texto y luego le da la
opción de buscar una palabra específica, mostrando como resultado
el rango de posiciones donde se encontró la palabra exacta. (Sin darle
importancia a mayúsculas o minúsculas)*/

    Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa un texto:  ");
        String textoUser = consola.nextLine();
        if (!textoUser.isEmpty()){
            List<String> textoSeparado = new ArrayList<>();
            for (String palabra : textoUser.split(" ")){
                textoSeparado.add(palabra);
            }
            for (String palabra : textoSeparado){
                System.out.println(palabra);
            }
            boolean flag = false;
            System.out.println("Ingresa la palabra que quieres buscar:  ");
            String palabraBuscada = consola.nextLine();
            int posicionInicio = 0;
            int posicionFinal = 0;
            for (String palabra : textoSeparado){
                if (palabra.equalsIgnoreCase(palabraBuscada)){
                    flag = true;
                    posicionInicio = textoUser.indexOf(palabraBuscada);
                    posicionFinal = posicionInicio+palabraBuscada.length()-1;
                }
            }
            if (flag){
                System.out.println("palabra encontrada\nempieza por : " + posicionInicio + " , y termina por : " + posicionFinal);
            }else {
                System.out.println("palabra no encontrada");
            }
        }


    }
}
