package ie.atu.week6;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private  ProductService myProduct;
    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }
   @GetMapping("/getProducts")
    public List<Product> getAllProducts() {
        return myProduct.getAllProducts();
    }

    @PostMapping("/newProduct")
    public List<Product> newProduct(@RequestBody @Valid Product product) {
        return myProduct.addProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public List<Product> deleteProduct(@PathVariable int id)
    {
        return myProduct.deleteProduct(id);
    }

}
