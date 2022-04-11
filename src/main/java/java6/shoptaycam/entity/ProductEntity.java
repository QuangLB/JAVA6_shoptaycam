package java6.shoptaycam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product", schema = "shoptaycam", catalog = "")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "img")
    private String img;
    @Column(name = "price")
    private Integer price;
    @Temporal(TemporalType.DATE)
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "status")
    private Byte status;
    @Column(name = "brandId")
    private int brandId;

    @ManyToOne
    @JoinColumn(name="brandsId")
    BrandsEntity brand;

    @JsonIgnore
    @OneToMany(mappedBy = "productId")
    List<OrderdetailsEntity> orderDetails;



}
