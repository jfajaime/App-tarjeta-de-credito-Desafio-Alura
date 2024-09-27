import com.desafiotarjeta.calculos.Compra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TarjetaApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Compra> compras = new ArrayList<>();

        System.out.print("Ingrese el limite de su tarjeta >$");
        double saldo = teclado.nextDouble();

        while (true){
            System.out.println("Ingrese el nombre del articulo o ( 'salir' para terminar)");
            String nombre = teclado.next();

            if (nombre.equalsIgnoreCase("salir")){
                break;
            }
            System.out.println("Ingrese el precio del articulo >$");
            double precio = teclado.nextDouble();

            if (saldo >= precio){
                compras.add(new Compra(nombre, precio));
                saldo -= precio;
                System.out.println("Compra realizada. Saldo restante >$" + saldo);
            }else {
                System.out.println("Saldo insuficiente. No se puede realizar la compra.");
                break;
            }
        }
        System.out.println("*******************************\n");
        Collections.sort(compras); //ordena la lista antes de imprimir
        System.out.println("Resumen De Compras: \n");

        for (Compra compra : compras) {
            System.out.println(compra);
        }
        System.out.println("\n*******************************");
        System.out.println("Saldo de tarjeta >$" + saldo);

        teclado.close();
    }
}
