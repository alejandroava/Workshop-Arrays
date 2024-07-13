import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class FacturacionTienda {
    public static void main(String[] args) {
        /*Ejercicio 2: Facturación de una tienda.
Un cliente realiza una compra en una tienda. El programa proporciona
un array de productos y un array de precios. Se requiere pedir al
usuario la cantidad de cada producto que desea comprar, para
posteriormente imprimir el valor total de la factura.*/
        String userProduct;
        double [] prices = {20,35,45,15,5};
        String [] products = {"Camiseta","Pantaloneta","Chaqueta","Pantalon","Medias"};
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {
            String product = products[i];
            double price = prices[i];
            System.out.println((i+1)+" Producto: " + product + " Precio: " + price);
        }
        System.out.println("Elija el producto que desea comprar");
        int optionProduct= entrada.nextInt();

        if (optionProduct >= 1 && optionProduct <= products.length) {
            userProduct = products[optionProduct - 1];
            System.out.println("Ingrese la cantidad de " + userProduct + " que desea llevar");
            int cantidad = entrada.nextInt();

            if (cantidad > 0) {
                double precioUnitario = prices[optionProduct - 1];
                double totalFactura = cantidad * precioUnitario;
                System.out.println("La factura es de: $" + totalFactura);
            } else {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } else {
            System.out.println("Elija una opción correcta");
        }

    }
}
