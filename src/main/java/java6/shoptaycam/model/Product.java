package java6.shoptaycam.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Product {
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
    private Boolean role;
}
