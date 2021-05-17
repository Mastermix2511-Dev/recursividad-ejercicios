package recursividad;

public class Recursividad {

    public Recursividad() {
    }

    public int sumaRecursiva(int n) {

        if (n <= 1) {
            return 1;
        } else
            return n + sumaRecursiva(n - 1);
    }

    public int digitosContiene(int n) {
        if (n < 10)
            return 1;
        else
            return 1 + digitosContiene(n / 10);
    }


    public int sumaDigitos(int num) {
        if (num == 0) {
            return 0;
        } else {
            return sumaDigitos(num / 10) + num % 10;
        }
    }


    public int divisionRecursiva(int dividiendo, int divisor) {
        if (dividiendo < divisor) {
            return 0;
        } else {
            return 1 + divisionRecursiva(dividiendo - divisor, divisor);
        }
    }

    public void conteo(int n, int conteo) {

        if (n <= conteo) {
            System.out.println(n);
            conteo(n + 1, conteo);
        } else
            System.out.println("Termino el conteo");

    }

}
