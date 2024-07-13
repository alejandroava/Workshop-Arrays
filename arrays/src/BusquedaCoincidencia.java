import javax.management.monitor.StringMonitor;
import java.util.Scanner;

public class BusquedaCoincidencia {
    public static void main(String[] args) {
        /*Ejercicio 6: Búsqueda por coincidencia en arrays
Crea un array de Strings (por ejemplo, nombres) y pide al usuario que
ingrese un nombre. Busca ese nombre en el array que imprima si se
encuentra la posición y si no un mensaje que no se encuentra.*/

        String[] names = new String[5];
        Scanner entrada = new Scanner(System.in);
        String name = "";
        String nameSearch = "";
        for(int i=0;i<5;i++){
            System.out.println((i+1)+" Ingrese nombre");
            name = entrada.nextLine();
            names[i] = name;
        }
        System.out.println("Ingrese el nombre a buscar");
        nameSearch = entrada.nextLine();
        boolean flag = false;
        for(String i : names){
            if(i.equalsIgnoreCase(nameSearch)){
                flag = true;
            }
        }
        if(flag){
            System.out.println("El nombre existe");
        }else{
            System.out.println("el nombre no existe");
        }

    }
}
