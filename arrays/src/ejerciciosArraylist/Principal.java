package ejerciciosArraylist;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Moto nkd = new Moto("jms02f","negro");
        Moto libero = new Moto("plk02l","azul");
        Moto boxer = new Moto("hjf05p","blanco");

        ArrayList<Moto> motosEconomicas = new ArrayList<>();

        //Metodo size sirve para ver el tamaño de un ArrayList.
        System.out.println(motosEconomicas.size());

        //Metodo add sirve para agregar un elemento a un ArrayList en la ultima posicion.
        motosEconomicas.add(nkd);
        motosEconomicas.add(libero);

        System.out.println(motosEconomicas.size());
        System.out.println(motosEconomicas);
        motosEconomicas.add(new Moto("hjf05p","blanco"));

        System.out.println(motosEconomicas);

        //Metodo Get sirve para obtener un dato de una lista indicando el indice.
        System.out.println("la moto en la posicion 1 es: "+ motosEconomicas.get(0));

        for(int i=0;i<motosEconomicas.size();i++){
            System.out.println("la moto en la posicion "+ i+ " es "+motosEconomicas.get(i));
        }

        //Metodo Remove sirve para eliminar un dato de un ArrayList indicando el indice.
        motosEconomicas.remove(0);
        System.out.println(motosEconomicas);

        //Metodo clear sirve para borrar todos los datos de un ArrayLIst

//        motosEconomicas.clear();
//        System.out.println(motosEconomicas);

    }
}
