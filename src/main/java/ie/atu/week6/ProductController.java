package ie.atu.week6;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


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
    @PutMapping("/updateProduct/{id}")
    public List<Product> updateProduct(@RequestBody @Valid Product product, @PathVariable int id) {
        return myProduct.putProduct(product, id);
    }
    @DeleteMapping("/delete/{id}")
    public List<Product> deleteProduct(@PathVariable int id)
    {
        return myProduct.deleteProduct(id);
    }

}
