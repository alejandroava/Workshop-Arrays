import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {
       /*Ejercicio 4: Calculadora de descuentos.
Crea un programa que calcule los descuentos por compras(Ejercicio 2)
en una tienda, donde se aplica un porcentaje de descuento en función
del monto total de la compra, con rangos de precios personalizados.*/
        String userProduct;
        double [] prices = {20,35,45,15,5};
        String [] products = {"Camiseta","Pantaloneta","Chaqueta","Pantalon","Medias"};
        Scanner entrada = new Scanner(System.in);
        double totalFactura=0;
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
                totalFactura = cantidad * precioUnitario;
                System.out.println("La factura es de: $" + totalFactura);
            } else {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } else {
            System.out.println("Elija una opción correcta");
        }

        double descuento = 0;
        if(totalFactura >= 100){
            descuento = totalFactura * 0.25;
        }else if(totalFactura >= 50){
            descuento = totalFactura * 0.2;
        }else if(totalFactura >= 30){
            descuento = totalFactura * 0.15;
        }else if(totalFactura >= 20){
            descuento = totalFactura * 0.1;
        } else{
            System.out.println("No tiene descuento");
        }

        if (descuento > 0) {
            System.out.println("Descuento aplicado: $" + descuento);
            double totalConDescuento = totalFactura - descuento;
            System.out.println("Total a pagar con descuento: $" + totalConDescuento);
        }

    }

}
