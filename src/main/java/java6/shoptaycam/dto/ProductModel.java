package java6.shoptaycam.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Accessors(chain = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ProductModel{
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
