package classesWithAttributes_2_8;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "Laptop";
		product.description = "Asus Laptop";
		product.price = 4500;
		product.stockAmount = 3;
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
	}

}
