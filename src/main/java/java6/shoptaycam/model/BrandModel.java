package java6.shoptaycam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandModel {
    @NotNull
    private Integer id;
    @NotNull
    @NotBlank
    private String name;
}
