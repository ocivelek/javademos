package methods_2_1;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 3;
		boolean control = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				control = true;
				break;
			}
		}
		if (control) {
			mesajVer(aranacak);
		} else {
			mesajVer2("Sayı Mevcut Değildir: " + aranacak);
		}
	}

	public static void mesajVer(int ara/* parametreli metot */) {
		System.out.println("Sayı Mevcuttur: " + ara);
	}

	public static void mesajVer2(String mesaj/* parametreli metot */) {
		System.out.println(mesaj);
	}
}
