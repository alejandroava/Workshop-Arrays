import java.util.Scanner;

public class ArraysEjercicios {
    public static void main(String[] args) {
        /*Ejercicio 1: Menú interactivo.
Este ejercicio propone la creación de un programa que presente al
usuario un menú interactivo para realizar operaciones matemáticas
básicas como suma, resta, multiplicación y división.*/

        int optionMenu;
        do {
            showMenu();
            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese una opcion del menu");
            optionMenu = entrada.nextInt();


        switch (optionMenu){
            case 1:
                System.out.println("Ingrese los numeros a sumar");
                int num1 = entrada.nextInt();
                int num2 = entrada.nextInt();
                int suma = num1 + num2;
                System.out.println("La suma de los numeros es: "+suma);
                break;
            case 2:
                System.out.println("Ingrese los numeros a restar");
                int numr1 = entrada.nextInt();
                int numr2 = entrada.nextInt();
                int resta = numr1 - numr2;
                System.out.println("La suma de los numeros es: "+resta);
                break;
            case 3:
                System.out.println("Ingrese los numeros a multiplicar");
                int numm1 = entrada.nextInt();
                int numm2 = entrada.nextInt();
                int multiplicacio = numm1 * numm2;
                System.out.println("La suma de los numeros es: "+multiplicacio);
                break;
            case 4:
                System.out.println("Ingrese los numeros a multiplicar");
                int numd1 = entrada.nextInt();
                int numd2 = entrada.nextInt();
                int division = numd1 / numd2;
                System.out.println("La suma de los numeros es: "+ division);
                break;
            case 5:
                System.out.println("saliendo...");
                break;
            default:
                System.out.println("el numero ingresado no es correcto");
        }
        }while(optionMenu != 5);

    }
    public static void showMenu(){
        System.out.println("Operaciones basicas");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
    }
}
