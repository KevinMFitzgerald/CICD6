package ie.atu.week6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> myList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return myList;
    }

    public List<Product> addProduct(Product product) {
        myList.add(product);
        return myList;
    }
    public List<Product> deleteProduct(Product product) {
        myList.remove(product);
        return myList;
    }
}