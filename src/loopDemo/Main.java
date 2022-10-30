package loopDemo;

public class Main {

	public static void main(String[] args) {
		// FOR
		// int i;
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü Bitti");
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Dögü Bitti");

		// While
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü bitti");
	}

}
