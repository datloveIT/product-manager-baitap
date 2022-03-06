import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
        this.products.add(new Product(0, "John", 2, "Hanoi"));
        this.products.add(new Product(1, "John", 2, "Hanoi"));
        this.products.add(new Product(2, "Bill", 1, "Danang"));
        this.products.add(new Product(3, "Alex", 234, "Saigon"));
        this.products.add(new Product(4, "Adam", 3443, "Beijin"));
        this.products.add(new Product(5, "Sophia", 342, "Miami"));
        this.products.add(new Product(6, "Rose", 234, "Newyork"));

    }
    public int size() {
        return this.products.size();
    }
    public void editProduct(int id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name Product: ");
        String name = scanner.nextLine();
        System.out.println("Enter price Product");

        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter informaiton Product: ");
        String information = scanner.nextLine();

        Product product = new Product(id, name, price, information);
        this.products.set(id, product);
        showProduct();
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void showProduct() {
        this.products.forEach(product -> {
            System.out.println(product.toString());
        });
    }
    public void showOneProduct(int id) {
        Product product = this.products.get(id);
        System.out.println(product.toString());
    }
    public void remove(int id) {
        this.products.remove(id);
    }

}
