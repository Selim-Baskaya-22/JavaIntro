package DersteYaptýðýmýzUygulamalar;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10); // REFERANS OLUÞTURMA.
		
	
		
		Product product2 = new Product(); // REFERANS OLUÞTURMA.
		product2.setId(1);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		product2.getUnitPriceAfterDiscount();
		
		Product product3 = new Product(); // REFERANS OLUÞTURMA.
	
		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println("Ürün Adý: "+product.getName() + " Fiyat: " + product.getUnitPrice() + " detay: " + product.getDetail()+ "");

		}

		
		
		
		
		
		
		System.out.println(products.length);

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ev/Bahçe"); 
		
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);

		productManager.addToCart(product2);

		productManager.addToCart(product3);

	}

}