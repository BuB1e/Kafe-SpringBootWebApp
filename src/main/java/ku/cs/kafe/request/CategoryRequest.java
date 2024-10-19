// 6510451018 Harit Sombatsiri
package ku.cs.kafe.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CategoryRequest {


    @NotBlank
    private String name;


}
