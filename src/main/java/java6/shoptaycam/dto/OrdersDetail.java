package java6.shoptaycam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDetail {
    @NotNull
    @NotBlank
    private Integer id;
    @NotNull
    @NotBlank
    private Integer orderId;
    @NotNull
    @NotBlank
    private Integer productId;
    @NotNull
    private Integer price;
    @NotNull
    private Boolean status;
}
