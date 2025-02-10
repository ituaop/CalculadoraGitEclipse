
public class Calculadora {
	public int sumar(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println("Resultado de la suma: " + calc.sumar(5, 3));
	}
}

