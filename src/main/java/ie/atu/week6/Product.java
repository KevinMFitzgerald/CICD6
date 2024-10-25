package ie.atu.week6;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Min(value = 1,message = "must be larger than 1")
    private int id;
    @NotBlank(message="You must enter a name")
    private String name;
    @PositiveOrZero( message = "must be larger than 1")
    private Double price;


}