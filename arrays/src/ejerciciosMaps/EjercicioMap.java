package ejerciciosMaps;
import java.util.Map;

import java.util.HashMap;

public class EjercicioMap {
    public static void main(String[] args) {
        Map<Integer, String> criptomonedas = new HashMap<>();

        //Metodo Put() sirve para ingresar datos en el Map
        criptomonedas.put(1, "Bitcoin");
        criptomonedas.put(2, "Eterium");
        criptomonedas.put(3, "Oro");
        criptomonedas.put(4, "Cardano");

        //Metodo keySet() sirve para  obtener las llaves del Map
        System.out.println("Esto son las llaves "+criptomonedas.keySet());

        //Metodo values() sirve para obtener los valores del Map
        System.out.println("Esto son los valores "+criptomonedas.values());

        //Metodo Get() sirve para obtener el valor de la llave, se coloca entre parentesis la llave

        System.out.println("El valor es: "+ criptomonedas.get(3));

        //Metodo isEmpty sirve para verificar si el Map esta vacio, nos devuelve un true o False

        System.out.println("El array esta vacio?: "+criptomonedas.isEmpty());

        //Metodo Size() Sirve para verificar el tamaño del Map

        System.out.println("El tamaño del Map es de: "+criptomonedas.size());

        //Metodo containsKey() sirve para verificar si en el Map existe una llave con el nombre que le indiquemos, devuelve true o false

        System.out.println("la llave con el valor 1 existe? "+ criptomonedas.containsKey(1));

        //Metodo containsValue() sirve para verificar si un valor del map existe, nos devuelve tru o false, tiene encuenta mayusculas y minisculas.

        System.out.println("El valor Bitcoin existe? "+ criptomonedas.containsValue("Bitcoin"));

        //Metodo forEach sirve para recorrer el map , llaves y valores

        criptomonedas.forEach((k,v)-> System.out.println("llave:"+ k + " valor:"+ v));

        //Metodo remove() sirve para eliminar un llave-valor del Map se coloca entre parentesis la llave.

        criptomonedas.remove(2);
        criptomonedas.forEach((k,v)-> System.out.println("llave:"+ k + " valor:"+ v));

    }
}
