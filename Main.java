import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize product and customer managers
        ProductManager productManager = new ProductManager();
        CustomerManager customerManager = new CustomerManager();

        // Create products
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 500);

        // Add products to the product manager
        productManager.addProduct(product1);
        productManager.addProduct(product2);

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Add customers to the customer manager
        customerManager.addCustomer(customer1);
        customerManager.addCustomer(customer2);

        // Display available products
        productManager.displayProducts();

        // Customers place orders
        Order order1 = customer1.placeOrder(product1, 2);
        Order order2 = customer2.placeOrder(product2, 1);

        // Display order details
        order1.displayOrder();
        order2.displayOrder();
    }
}
