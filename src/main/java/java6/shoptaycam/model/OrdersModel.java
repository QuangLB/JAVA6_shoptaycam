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
public class OrdersModel {
    @NotNull
    @NotBlank
    private Integer id;
    @NotNull
    @NotBlank
    private String username;
    @NotNull
    @NotBlank
    private String address;
    @NotNull
    @NotBlank
    private Date createDate;
    @NotNull
    private Boolean status;
}
