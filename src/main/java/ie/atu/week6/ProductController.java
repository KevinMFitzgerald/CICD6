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
   /* @PutMapping("/{id}")
    public ResponseEntity<List> updateProduct(@PathVariable int id, @RequestBody Product product)
    {
        for(int i=0; i < products.size(); i++)
        {
            if(products.get(i).getId() == id)
            {
                products.set(i, product);
            }
        }
        return ResponseEntity.ok(products);
    }*/
    @DeleteMapping("/{id}")
    public List<Product> deleteProduct(@PathVariable int id, @RequestBody Product product)
    {
        return myProduct.deleteProduct(product);
    }

}