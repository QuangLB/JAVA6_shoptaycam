package java6.shoptaycam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product", schema = "shoptaycam", catalog = "")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id" , insertable = false, updatable = false)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "img")
    private String img;
    @Column(name = "price")
    private Integer price;
    @Temporal(TemporalType.DATE)
    @Column(name = "createdate")
    private Date createDate;
    @Column(name = "status")
    private Byte status;
    @Column(name = "brandid")
    private int brandId;

    @ManyToOne
    @JoinColumn(name="brandid", insertable = false, updatable = false)
    BrandsEntity brand;

    @JsonIgnore
    @OneToMany(mappedBy = "productId")
    List<OrderdetailsEntity> orderDetails;



}
