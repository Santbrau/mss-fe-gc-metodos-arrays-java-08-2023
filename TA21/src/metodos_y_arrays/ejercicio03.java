package metodos_y_arrays;
import javax.swing.JOptionPane;

public class ejercicio03 {

	public static void main(String[] args) {
		
		String numeroInput = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(numeroInput);

        boolean esPrimo = esNumeroPrimo(numero);

        if (esPrimo) {
            JOptionPane.showMessageDialog(null, numero + " es un número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número primo.");
        }
    }

    public static boolean esNumeroPrimo(int numero) {
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

}
