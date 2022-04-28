package java6.shoptaycam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders", schema = "shoptaycam", catalog = "")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "username" , insertable = false, updatable = false)
    private String username;
    @Column(name = "address")
    private String address;
    @Temporal(TemporalType.DATE)
    @Column(name = "createdate")
    private Date createdate;
    @Column(name = "status")
    private Byte status;

    @JsonIgnore
    @OneToMany(mappedBy = "orderId")
    List<OrderdetailsEntity> orderDetails;

    @ManyToOne
    @JoinColumn(name="username")
    UserEntity user;

}
