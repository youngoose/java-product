import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductByPlace(String place) {
        List<Product> tmpProducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getPlace().equalsIgnoreCase(place)) {
                tmpProducts.add(p);
            }
        }
        return tmpProducts;
    }

    public void getProductByPlaceUsingStream(String place) {
       products.stream().filter(p -> p.getPlace().equalsIgnoreCase(place)).forEach(p -> System.out.println(p));
    }

    public List<Product> getProductByText(String text) {
        String lowerText = text.toLowerCase();
        List<Product> tmpProducts = new ArrayList<>();
        for (Product p : products) {
            String name = p.getName().toLowerCase();
            String place = p.getType().toLowerCase();
            String type = p.getType().toLowerCase();

            if (name.contains(lowerText) || place.contains(lowerText) || type.contains(lowerText)) {
                tmpProducts.add(p);
            }
        }
        return tmpProducts;
    }

    public List<Product> getProductWhichOutOfWarranty() {
        List<Product> expiredProducts = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();
        for (Product p : products) {
            if (p.getWarranty() < currentYear) {
                expiredProducts.add(p);
            }
        }
        return expiredProducts;
    }
}
