package variableArguments_2_3;

public class Main {

	public static void main(String[] args) {
		System.out.println(topla(5, 7));

		System.out.println(topla2(1, 2, 43, 5, 241, 4, 54, 21));
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar)/* Variable arguments */ {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;
	}
}
