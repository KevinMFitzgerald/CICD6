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
    public List<Product> deleteProduct(int id) {
        for(int i=0; i < myList.size(); i++)
        {
            if(myList.get(i).getId() == id)
            {
                myList.remove(i);
            }
        }
        return myList;
    }
}