import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        ProductManager productManager = new ProductManager();
        while (true) {
            System.out.println("Product Manager: ");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Watch Information All Product");
            System.out.println("4. Watch Information 1 Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            String select = scanner.nextLine();
            switch (Integer.parseInt(select)) {
                case 1:
                    int dem = productManager.size();
                    count = dem + 1;
                    System.out.println("Enter name Product: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter price Product");

                    Double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter informaiton Product: ");
                    String information = scanner.nextLine();

                    Product product = new Product(count, name, price, information);
                    productManager.addProduct(product);
                    System.out.println(product.toString());
                    break;
                case 2:
                    System.out.println("Enter id product remove: ");
                    int idm = Integer.parseInt(scanner.nextLine());
                    productManager.editProduct(idm);
                    break;
                case 3:
                    productManager.showProduct();
                    break;
                case 4:
                    System.out.println("Enter id product remove: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    productManager.showOneProduct(id);
                    break;
                case 5:
                    System.out.println("Enter id product remove: ");
                    int idx = Integer.parseInt(scanner.nextLine());
                    productManager.remove(idx);
                    System.out.println("thanh cong");
                    productManager.showProduct();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
