package sayiBulma;

public class Main {

	public static void main(String[] args) {
		/*int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 10;
		boolean control = false;
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				System.out.println("Sayı var");
				control = true;
			}
		}
		if (control == false) {
			System.out.println("Sayı yok");
		}*/

		System.out.println("-------------------------------");
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 1;
		boolean control = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				control = true;
				break;
			}
		}
		if (control) {
			System.out.println("Sayı Mevcuttur");
		} else {
			System.out.println("Sayı mevcut değildir");
		}
	}

}
