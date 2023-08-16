package metodos_y_arrays;
import javax.swing.JOptionPane;
import java.util.Random;

public class ejercicio11 {

	public static void main(String[] args) {
		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de los arrays:"));

        int[] array1 = new int[tamanoArray];
        int[] array2 = new int[tamanoArray];

        rellenarArrayAleatorio(array1);
        rellenarArrayAleatorio(array2);

        int[] arrayMultiplicado = multiplicarArrays(array1, array2);

        System.out.println("Array 1:");
        mostrarArray(array1);

        System.out.println("Array 2:");
        mostrarArray(array2);

        System.out.println("Array multiplicado:");
        mostrarArray(arrayMultiplicado);
    }

    public static void rellenarArrayAleatorio(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10); 
        }
    }

    public static int[] multiplicarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i];
        }

        return resultado;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
}