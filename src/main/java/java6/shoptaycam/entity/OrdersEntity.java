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
@Table(name = "orders", schema = "shoptaycam", catalog = "")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "username" , insertable = false, updatable = false)
    private String username;
    @Column(name = "address")
    private String address;
    @Temporal(TemporalType.DATE)
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "status")
    private Byte status;

    @JsonIgnore
    @OneToMany(mappedBy = "orderId")
    List<OrderdetailsEntity> orderDetails;

    @ManyToOne
    @JoinColumn(name="username")
    UserEntity user;

}
