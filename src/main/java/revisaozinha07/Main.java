package revisaozinha07;

public class Main {

	public static void main(String[] args) {
		Main uau = new Main();
		uau.novotrem();
	}

	private void novotrem() {
		calcular(5,5);
		calcular(10.27,8.2);
		calcular("44 ","um texto qualquer");
	}

	/**
	 * Faz continha de mais menos e concatena
	 * 
	 * @param valor1
	 * @param valor2
	 */
	private void calcular(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		System.out.println("Continha feliz: "+resultado);
	}

	private void calcular(double valor1, double valor2) {
		double resultado = valor1 - valor2;
		System.out.println("Continha feliz: "+resultado);
	}

	private void calcular(String trem1, String trem2) {
		String wau = trem1 + trem2;
		System.out.println("Continha feliz: "+wau);
	}

}
