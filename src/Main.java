import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

        List<Product> products = service.getAllProducts();
        for(Product p : products) {
            System.out.println(p);
        }

        System.out.println("==============================================");
        System.out.println("a Particular product");

        Product p = service.getProduct("logi mouse");
        System.out.println(p);

        System.out.println("==============================================");
        System.out.println("a Particular product by place");

        List<Product> searchedProductsWithPlace = service.getProductByPlace("white table");

        for(Product sp : searchedProductsWithPlace) {
            System.out.println(sp);
        }

        System.out.println("==============================================");
        System.out.println("a Particular product by place using stream");

        service.getProductByPlaceUsingStream("black table");

        System.out.println("==============================================");
        System.out.println("a Particular product by text");

        List<Product> searchedProductWithText = service.getProductByText("mo");
        for(Product st : searchedProductWithText) {
            System.out.println(st);
        }

        System.out.println("==============================================");
        System.out.println("products out of warranty");

        List<Product> searchedProductOutOfWarranty = service.getProductWhichOutOfWarranty();
        for(Product sw : searchedProductOutOfWarranty) {
            System.out.println(sw);
        }
    }
}