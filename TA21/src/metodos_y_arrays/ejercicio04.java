package metodos_y_arrays;
import javax.swing.JOptionPane;

public class ejercicio04 {

	public static void main(String[] args) {
		
		String numeroInput = JOptionPane.showInputDialog("Ingrese un número entero para calcular su factorial:");
        int numero = Integer.parseInt(numeroInput);

        long factorial = calcularFactorial(numero);

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }

    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }

        if (numero == 0 || numero == 1) {
            return 1;
        }

        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
		

	}

}
