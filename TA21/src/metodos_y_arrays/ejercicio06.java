package metodos_y_arrays;
import javax.swing.JOptionPane;

public class ejercicio06 {

	public static void main(String[] args) {
		String numeroInput = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        
        try {
            int numero = Integer.parseInt(numeroInput);
            
            if (numero >= 0) {
                int numeroCifras = contarCifras(numero);
                JOptionPane.showMessageDialog(null, "El número " + numero + " tiene " + numeroCifras + " cifras.");
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un número entero positivo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida. Ingrese un número entero positivo.");
        }
    }

    public static int contarCifras(int numero) {
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        return contador;

	}

}
