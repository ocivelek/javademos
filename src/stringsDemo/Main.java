package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman Sayısı :" + mesaj.length());// Metnin boşluklar dahil eleman sayısını verir.
		System.out.println("5. eleman : " + mesaj.charAt(4));// Metin içersinde istenilen karakteri verir.
		System.out.println(mesaj.concat(" Yaşasın!"));// mevcut metine yeni bir metin eklemeye yarar.
		/*
		 * String mesaj2; System.out.println(mesaj2 = mesaj.concat(" Yaşasın!"));
		 * System.out.println(mesaj2);
		 */
		System.out.println(mesaj.startsWith("B"));// Metnin Bharfi ile başlayıp başlamadığını True veya false olarak
													// bildirir
		System.out.println(mesaj.endsWith("."));// Metnin . ile bitip bitmediğini True veya false olarak bildirir

		char[] karakterler = new char[25];
		mesaj.getChars(0, 10, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('a'));// Metin içinde a'nın ilk hangi sırada olduğunu verir. kontrole baştan
												// başlar.
		System.out.println(mesaj.lastIndexOf('a'));// metni sondan okumaya başlar.içinde a geçen yerin baştan numarasını
													// verir.

		String yeniMesaj = mesaj.replace(' ', '-');// metinde boşlukları - ile değiştirdik.
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 5));// metinde istediğimiz aralıktaki değerleri getirir

		for (String kelime : mesaj.split(" ")) { // split/metin ayırma. istenilen karaktere göre ayırma yapar
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());// metnin tamamını küçük harfe çevirir
		System.out.println(mesaj.toUpperCase());// metnin tamamını büyük harfe çevirir

		System.out.println(mesaj.trim());// metnin başlangıcı ve sonunda boşluk varsa kaldırır

	}

}
