import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - Price: $" + product.getPrice());
        }
        System.out.println();
    }
}
