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

                    String asientoSeleccionado = "";

                    switch (aeropuertoIndex) {
                        case 0:
                            // primer aeropuerto
                            System.out.println("Asientos disponibles:");
                            System.out.println("Digite un asiento ejemplo 1A o 2A");

                            String[][][][] asientos = isPublic ? Aeropuerto.getAsientosPublicos() : Aeropuerto.getAsientosPrivados();
                            for (int i = 0; i < asientos[companiaIndex][vueloIndex][aeropuertoIndex].length; i++) {
                                System.out.print(asientos[companiaIndex][vueloIndex][aeropuertoIndex][i] + " ");
                            }
                            System.out.println();
                            System.out.println("Digita el asiento deseado: ");

                            asientoSeleccionado = sc.next();

                            for (int i = 0; i < asientos[companiaIndex][vueloIndex][aeropuertoIndex].length; i++) {
                                if (asientos[companiaIndex][vueloIndex][aeropuertoIndex][i].equals(asientoSeleccionado)) {
                                    asientos[companiaIndex][vueloIndex][aeropuertoIndex][i] = "O";
                                }
                            }
                            break;
                        case 1:
                            // segundo aeropuerto
                            System.out.println("Asientos disponibles:");
                            System.out.println("Digite un asiento ejemplo 1A o 2A");

                            String[][][][] asientos2 = isPublic ? Aeropuerto.getAsientosPublicos2() : Aeropuerto.getAsientosPrivados2();
                            for (int i = 0; i < asientos2[companiaIndex][vueloIndex][aeropuertoIndex - 1].length; i++) {
                                System.out.print(asientos2[companiaIndex][vueloIndex][aeropuertoIndex - 1][i] + " ");
                            }
                            System.out.println();
                            System.out.println("Digita el asiento deseado: ");

                            asientoSeleccionado = sc.next();

                            for (int i = 0; i < asientos2[companiaIndex][vueloIndex][aeropuertoIndex - 1].length; i++) {
                                if (asientos2[companiaIndex][vueloIndex][aeropuertoIndex - 1][i].equals(asientoSeleccionado)) {
                                    asientos2[companiaIndex][vueloIndex][aeropuertoIndex - 1][i] = "O";
                                }
                            }
                            break;
                        case 2:
                            // tercer aeropuerto
                            System.out.println("Asientos disponibles:");
                            System.out.println("Digite un asiento ejemplo 1A o 2A");

                            String[][][][] asientos3 = isPublic ? Aeropuerto.getAsientosPublicos3() : Aeropuerto.getAsientosPrivados3();
                            for (int i = 0; i < asientos3[companiaIndex][vueloIndex][aeropuertoIndex - 2].length; i++) {
                                System.out.print(asientos3[companiaIndex][vueloIndex][aeropuertoIndex - 2][i] + " ");
                            }
                            System.out.println();
                            System.out.println("Digita el asiento deseado: ");

                            asientoSeleccionado = sc.next();

                            for (int i = 0; i < asientos3[companiaIndex][vueloIndex][aeropuertoIndex - 2].length; i++) {
                                if (asientos3[companiaIndex][vueloIndex][aeropuertoIndex - 2][i].equals(asientoSeleccionado)) {
                                    asientos3[companiaIndex][vueloIndex][aeropuertoIndex - 2][i] = "O";
                                }
                            }
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }

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
                    System.out.println(" ");
                    System.out.println("¿Desea seguir comprando tickets?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int continuar = sc.nextInt();
                    seguirComprando = (continuar == 1);

                } while (seguirComprando);
            } else if (opcion != 2) {
                System.out.println("Opción inválida");
            }
        } while (opcion != 2);

        System.out.println("Gracias por usar el sistema de compra de tickets");
    }
}
