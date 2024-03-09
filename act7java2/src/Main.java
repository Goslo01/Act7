// Luis Carlos Gonzalez Salinas, Matricula:2903629



// el nucleo del proyecto
public class Main {
    public static void main(String[] args) {

        //asignacion de numero
        int n = 15;

        // aqui calculamos y desplegamos mensaje con los números primos
        System.out.println("numeros primos");
        //creacion de ints para los numeros primos
        int countPrimos = 0;
        int numPrimos = 2;
        while (countPrimos < n) {
            // condicionales
            if (isPrime(numPrimos)) {
                System.out.print(numPrimos);
                countPrimos++;
                if (countPrimos < n) {
                    System.out.print(", ");
                }
            }
            numPrimos++;
        }
        // despliegue de los numeros primos
        System.out.println(", hasta " + n + " números");

        // aqui se calcula y se despliega lo de fibonacci
        System.out.println("\nSucesión de Fibonacci:");
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        // condicional de si valor n es mayor a 1
        if (n > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        // segundo despliegue en el que vienen los numeros
        System.out.println(", hasta " + n + " números");
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


