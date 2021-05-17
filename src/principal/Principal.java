package principal;

import recursividad.Recursividad;

import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static Recursividad recursividad = new Recursividad();
    public static int opc;

    public static void main(String[] args) {

        do {
            menu();
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> sumaRecursiva();
                case 2 -> divisionRecursiva();
                case 3 -> digitoRecursiva();
                case 4 -> digitoRecursivaSuma();
                case 0 -> System.out.println("Hasta la proxima...");
                default -> System.out.println("Digita una de las opciones anteriores...");
            }
        } while (opc != 0);
    }


    public static void menu() {
        System.out.println();
        System.out.println("Luis Felipe Martinez Ruiz");
        System.out.println("1.- Suma recursiva:---------");
        System.out.println("2.- Division recursiva------");
        System.out.println("3.- Digito recursivo--------");
        System.out.println("4.- Digito suma recursiva---");
        System.out.println("0.- Salir del programa:-----");
        System.out.println();
    }

    public static void sumaRecursiva() {
        System.out.print("Digita un numero: ");
        int n = sc.nextInt();
        System.out.println();
        int recu = recursividad.sumaRecursiva(n);
        System.out.println(recu);
    }

    public static void divisionRecursiva() {
        System.out.print("Digita un divisior: ");
        int divisior = sc.nextInt();
        System.out.print("Digita un dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println();
        int div = recursividad.divisionRecursiva(divisior, dividendo);
        System.out.println(div);
    }

    public static void digitoRecursiva() {
        System.out.print("Digita un divisior: ");
        int digito = sc.nextInt();
        int dig = recursividad.digitosContiene(digito);
        System.out.println(dig);
    }

    public static void digitoRecursivaSuma() {
        System.out.print("Digita un divisior: ");
        int digito = sc.nextInt();
        int dig = recursividad.sumaDigitos(digito);
        System.out.println(dig);
    }

    public static void pruebaConGit(){
        System.out.println("Esta es una prueba con git y acabo de poner un metodo");
    }
}
