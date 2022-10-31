package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 3.2, 10.3, 8.3, 5.6 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			System.out.println(number);
			total = total + number;
		}
		System.out.println("Toplam :" + total);
		System.out.println("En Büyük :" + max);

	}

}
