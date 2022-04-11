package java6.shoptaycam.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Orders {
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
