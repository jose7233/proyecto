package Main;

import Aeropuertos.aeropuerto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        aeropuerto Aeropuerto = new aeropuerto();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nComprar tickets");
            System.out.println("1. Sí");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                boolean seguirComprando;
                do {
                    System.out.println("Aeropuerto público o privado?");
                    System.out.println("1. Público");
                    System.out.println("2. Privado");
                    System.out.print("Selecciona una opción: ");
                    int tipoAeropuerto = sc.nextInt();
                    boolean isPublic = (tipoAeropuerto == 1);

                    System.out.println("Ingrese su nombre:");
                    String nombre = sc.next();

                    System.out.println("Ingrese su nacionalidad:");
                    String nacionalidad = sc.next();

                    System.out.println("Ingrese su número de pasaporte:");
                    int numPasaporte = sc.nextInt();

                    System.out.println(" ");
                    System.out.println("Aeropuertos:");
                    String[] Aeropuertos = isPublic ? Aeropuerto.getAeropuertosPublicos() : Aeropuerto.getAeropuertosPrivados();
                    for (int i = 0; i < Aeropuertos.length; i++) {
                        System.out.println((i + 1) + ". " + Aeropuertos[i]);
                    }
                    System.out.print("Ingresa el aeropuerto que deseas usar: ");
                    int aeropuertoIndex = sc.nextInt() - 1;
                    String aeropuertoSeleccionado = Aeropuertos[aeropuertoIndex];

                    System.out.println(" ");
                    System.out.println("Compañías:");
                    String[][] companias = isPublic ? Aeropuerto.getCompaniasPublicas() : Aeropuerto.getCompaniasPrivadas();
                    for (int i = 0; i < companias[aeropuertoIndex].length; i++) {
                        System.out.println((i + 1) + ". " + companias[aeropuertoIndex][i]);
                    }
                    System.out.print("Selecciona una compañía: ");
                    int companiaIndex = sc.nextInt() - 1;
                    String companiaSeleccionada = companias[aeropuertoIndex][companiaIndex];

                    System.out.println(" ");
                    System.out.println("Vuelos disponibles:");
                    String[][][] vuelos = isPublic ? Aeropuerto.getVuelosPublicos() : Aeropuerto.getVuelosPrivados();
                    for (int i = 0; i < vuelos[aeropuertoIndex][companiaIndex].length; i++) {
                        System.out.println((i + 1) + ". " + vuelos[aeropuertoIndex][companiaIndex][i]);
                    }
                    System.out.print("Selecciona un vuelo: ");
                    int vueloIndex = sc.nextInt() - 1;

                    String vueloSeleccionado = vuelos[aeropuertoIndex][companiaIndex][vueloIndex];

                    System.out.println(" ");
                    String asientoSeleccionado = "";
                    System.out.println("Asientos disponibles:");
                    String[][][][][] asientos = isPublic ? Aeropuerto.getAsientosPublicos() : Aeropuerto.getAsientosPrivados();
                    for (int i = 0; i < asientos[aeropuertoIndex][companiaIndex][vueloIndex].length; i++) {
                        for (int j = 0; j < asientos[aeropuertoIndex][companiaIndex][vueloIndex].length; j++) {
                            System.out.print(asientos[aeropuertoIndex][companiaIndex][vueloIndex][i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.print("Seleccione un asiento: ");
                    asientoSeleccionado = sc.next();

                    boolean asignado = false;
                    for (int i = 0; i < asientos[aeropuertoIndex][companiaIndex][vueloIndex].length; i++) {
                        for (int j = 0; j < asientos[aeropuertoIndex][companiaIndex][vueloIndex].length; j++) {
                            if (asientos[aeropuertoIndex][companiaIndex][vueloIndex][i][j].equals(asientoSeleccionado)) {
                                asientos[aeropuertoIndex][companiaIndex][vueloIndex][i][j] = "O";
                                asignado = true;

                            }
                        }

                    }

                    System.out.println();

                    System.out.println(" ");
                    System.out.println("\nTicket");
                    System.out.println(" ");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Nacionalidad: " + nacionalidad);
                    System.out.println("Número de pasaporte: " + numPasaporte);
                    System.out.println("Tipo de aeropuerto: " + (isPublic ? "Público" : "Privado"));
                    System.out.println("Aeropuerto: " + aeropuertoSeleccionado);
                    System.out.println("Compañía: " + companiaSeleccionada);
                    System.out.println("Vuelo: " + vueloSeleccionado);
                    System.out.println("Asiento: " + asientoSeleccionado);

                    System.out.println("¿Desea seguir comprando tickets?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int continuar = sc.nextInt();
                    seguirComprando = (continuar == 1);

                } while (seguirComprando);
            } else if (opcion != 2) {
                System.out.println("gracias por su compra");
            }
        } while (opcion != 2);

        System.out.println("Gracias por usar el sistema de compra de tickets");
    }
}