class ExercicioX {
	static long fibonacci(int value) {
		// http://pt.wikipedia.org/wiki/Sequ%C3%AAncia_de_Fibonacci#Abordagem_recursiva
		return (value < 2) ? value : fibonacci(value - 1)
				+ fibonacci(value - 2);
	}

	public static void main(String[] args) {

		System.out.println("Imprima todos os números de 150 a 300.");
		for (int i = 150; i <= 300; i++) {
			System.out.println(i);
		}

		int somaAte1000 = 0;
		for (int i = 1; i <= 1000; i++) {
			somaAte1000 += i;
		}
		System.out.println("Imprima a soma de 1 até 1000 = " + somaAte1000);

		System.out.println("Imprima todos os múltiplos de 3, entre 1 e 100.");
		for (int i = 1; i <= 100; i++) {
			int resto = i % 3;
			if (resto == 0) {
				System.out.println(i + " é múltiplo de 3");
			}
		}

		System.out.println("Imprima os fatoriais de 1 a 10.");
		long fatorial = 1L;
		for (int i = 1; i <= 10; i++) {
			fatorial *= i;
			System.out.println("O fatorial de " + i + " é " + fatorial);
		}

		System.out.println("Fibonacci");
		int maxFibonacci = 40;
		for (int i = 0; i <= maxFibonacci; i++) {
			System.out.println("(" + i + ") : " + fibonacci(i));
		}

		System.out.println("se x é par, x = x / 2");
		System.out.println("se x é impar, x = 3 * x + 1");

		int x = 13;
		while (x > 1) {
			int resto = x % 2;
			if (resto == 0 || resto == 2) {
				x /= 2;
			} else {
				x = 3 * x + 1;
			}

			System.out.print(x + ((x > 1) ? "->" : ""));
		}
		System.out.print("\n");

		System.out.println("fors encadeados");
		int maxEncadeado = 10;
		for (int n1 = 1; n1 <= maxEncadeado; n1++) {
			for (int n2 = 1; n2 <= n1; n2++) {
				System.out.print(n1 * n2 + " ");
			}
			System.out.print("\n");
		}
	}
}