package Exercise4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        List<Producto> ListProducts = new ArrayList<>();
        Producto producto = new Producto("Laptop", "Facilita tareas y es adecuado en cualquier momento", 100000, 85);
        ListProducts.add(producto);
        PerishableProduct perishableProduct = new PerishableProduct("Queso", "Cuajada", 13000, 20, "29/02/2024");
        ListProducts.add(perishableProduct);

        System.out.println("Lista de productos:");
        for (Producto p : ListProducts) {
            System.out.println(p.toString());
        }

        String[] opciones = {"AGREGAR PRODUCTO", "¿DESEAS MODIFICARLO?", "O ELIMINARLO?"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:");
                    String descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripción del producto:");
                    int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio del producto:"));
                    int stock = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el stock del producto:"));

                    Producto nuevoProducto = new Producto(nombre, descripcion, precio, stock);
                    ListProducts.add(nuevoProducto);
                    break;
                case 1:
                    int indiceMod = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el índice del producto a modificar:"));
                    if (indiceMod >= 0 && indiceMod < ListProducts.size()) {
                        Producto productoModificar = ListProducts.get(indiceMod);
                        int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio del producto:"));
                        int nuevoStock = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo stock del producto:"));

                        productoModificar.setPrice(nuevoPrecio);
                        productoModificar.setStock(nuevoStock);

                        System.out.println("Producto modificado:");
                        System.out.println(productoModificar.toString());
                    } else {
                        System.out.println("Índice inválido");
                    }
                    break;
                case 2:
                    int indiceEliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el índice del producto a eliminar:"));
                    if (indiceEliminar >= 0 && indiceEliminar < ListProducts.size()) {
                        Producto productoEliminar = ListProducts.remove(indiceEliminar);
                        System.out.println("Producto eliminado:");
                        System.out.println(productoEliminar.toString());
                    }
            }
        }

    }
}