package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 5;
		int control = 1;
		if (number == 1) {
			System.out.println("Sayı asal değildir.");
		} else if (number < 1) {
			System.out.println("Geçersiz sayı.");
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					control = 0;
				}
			}
			if (control == 1) {
				System.out.println("Sayı asaladır.");
			} else {
				System.out.println("Sayı asal değildir.");
			}
		}

	}

}
