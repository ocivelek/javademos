package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf1 = 'A';
		switch (harf1) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
		default:
			System.out.println("İnce Sesli Harf");
		}
		
		System.out.println("------------------------------------------------------------");
		
		char harf = 'A';
		boolean isThere = false;
		char[] kalinSesliHarfler = new char[4];
		kalinSesliHarfler[0] = 'A';
		kalinSesliHarfler[1] = 'I';
		kalinSesliHarfler[2] = 'O';
		kalinSesliHarfler[3] = 'U';
		char[] inceSesliHarfler = new char[4];
		inceSesliHarfler[0] = 'E';
		inceSesliHarfler[1] = 'İ';
		inceSesliHarfler[2] = 'Ö';
		inceSesliHarfler[3] = 'Ü';
		for (int i = 0; i < kalinSesliHarfler.length; i++) {
			if (harf == kalinSesliHarfler[i]) {
				System.out.println("kalın sesli harf");
				isThere = true;
			}
		}
		for (int i = 0; i < inceSesliHarfler.length; i++) {
			if (harf == inceSesliHarfler[i]) {
				System.out.println("ince sesli harf");
				isThere = true;
			}
		}
		if (isThere == false) {
			System.out.println("Sesli harf değildir.");
		}
	}

}
