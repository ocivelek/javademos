package classesWithAttributes_2_8;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(4500);
		product.setStockAmount(3);
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());
	}

}
