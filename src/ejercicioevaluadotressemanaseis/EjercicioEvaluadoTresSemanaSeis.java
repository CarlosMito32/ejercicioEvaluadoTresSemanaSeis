package ejercicioevaluadotressemanaseis;

/**
 *
 * @author carlo
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioEvaluadoTresSemanaSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingresa el tamaño del arreglo de números: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("El arreglo debe contener al menos un elemento.");
                return;
            }

            int[] arreglo = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Número [" + i + "]: ");
                arreglo[i] = scanner.nextInt();
            }

            int minimo = arreglo[0];
            int maximo = arreglo[0];

            for (int i = 1; i < arreglo.length; i++) {
                if (arreglo[i] < minimo) {
                    minimo = arreglo[i];
                }
                if (arreglo[i] > maximo) {
                    maximo = arreglo[i];
                }
            }

            System.out.println("\n--- Resultados ---");
            System.out.println("Valor Mínimo: " + minimo);
            System.out.println("Valor Máximo: " + maximo);

        } catch (InputMismatchException e) {
            System.out.println("Error de entrada: Por favor ingresa datos numéricos enteros.");
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
