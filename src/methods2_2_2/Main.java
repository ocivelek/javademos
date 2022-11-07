package methods2_2_2;

public class Main {

	public static void main(String[] args) {
		ekle();
		sil();
		guncelle();

		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);

		System.out.println(topla(5, 7));
		System.out.println(sehirVer());
	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("Güncellendi.");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
