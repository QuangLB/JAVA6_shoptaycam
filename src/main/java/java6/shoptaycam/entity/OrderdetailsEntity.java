package java6.shoptaycam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderdetails", schema = "shoptaycam", catalog = "")
public class OrderdetailsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "oderId")
    private Integer orderId;
    @Column(name = "productId" , insertable = false, updatable = false)
    private Integer productId;
    @Column(name = "price")
    private Integer price;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name="productId")
    ProductEntity products;

    @ManyToOne
    @JoinColumn(name="orderId")
    OrdersEntity orders;
}
