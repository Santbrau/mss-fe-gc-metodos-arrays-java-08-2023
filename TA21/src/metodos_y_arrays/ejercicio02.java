package metodos_y_arrays;
import javax.swing.JOptionPane;
import java.util.Random;

public class ejercicio02 {

	public static void main(String[] args) {
		 String cantidadInput = JOptionPane.showInputDialog("Ingrese la cantidad de números aleatorios que desea generar:");
	        int cantidadNumeros = Integer.parseInt(cantidadInput);

	        String minimoInput = JOptionPane.showInputDialog("Ingrese el valor mínimo del rango:");
	        int minimo = Integer.parseInt(minimoInput);

	        String maximoInput = JOptionPane.showInputDialog("Ingrese el valor máximo del rango:");
	        int maximo = Integer.parseInt(maximoInput);

	        StringBuilder numerosGenerados = new StringBuilder();

	        for (int i = 0; i < cantidadNumeros; i++) {
	            int numeroAleatorio = generarNumeroAleatorio(minimo, maximo);
	            numerosGenerados.append("Número ").append(i + 1).append(": ").append(numeroAleatorio).append("\n");
	        }

	        JOptionPane.showMessageDialog(null, numerosGenerados.toString());

	}
	
	public static int generarNumeroAleatorio(int minimo, int maximo) {
        if (minimo >= maximo) {
            throw new IllegalArgumentException("El valor mínimo debe ser menor que el valor máximo.");
        }

        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
	}

}
