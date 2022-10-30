package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("5 Geçtiniz.");
			break;
		case 'B':
			System.out.println("4 Geçtiniz.");
			break;
		case 'C':
			System.out.println("3 Geçtiniz.");
			break;
		case 'D':
			System.out.println("2 Geçtiniz.");
			break;
		case 'F':
			System.out.println("1 Kaldınız.");
			break;
		default:
			System.out.println("Geçersiz Not");
			
		  /*case 'B':
		    case 'C':
			System.out.println("3 Geçtiniz.");
			break;*/ 
			//iki durumuna ortak mesaj vermek

		}
	}

}
