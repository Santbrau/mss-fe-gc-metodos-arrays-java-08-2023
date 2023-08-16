package metodos_y_arrays;
import javax.swing.JOptionPane;
import java.util.Random;

public class ejercicio10 {

	public static void main(String[] args) {
		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del array:"));
        int minimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor mínimo:"));
        int maximo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor máximo:"));

        int[] array = generarArrayNumerosPrimos(tamanoArray, minimo, maximo);

        System.out.println("Array de números primos generados:");
        mostrarArray(array);

        int maximoNumero = encontrarMaximo(array);
        System.out.println("El número más grande es: " + maximoNumero);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] generarArrayNumerosPrimos(int tamano, int minimo, int maximo) {
        Random random = new Random();
        int[] array = new int[tamano];
        int count = 0;

        while (count < tamano) {
            int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
            if (esPrimo(numeroAleatorio)) {
                array[count] = numeroAleatorio;
                count++;
            }
        }

        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }

    public static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }
}
