package java6.shoptaycam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
    @NotNull
    @NotBlank
    private Integer id;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String img;
    @NotNull
    @NotBlank
    private Integer price;
    @NotNull
    @NotBlank
    private Date createDate;
    @NotNull
    private Boolean status;
    @NotNull
    @NotBlank
    private Integer brandId;

}
