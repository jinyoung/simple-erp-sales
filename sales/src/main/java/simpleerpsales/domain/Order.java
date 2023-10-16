package simpleerpsales.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import simpleerpsales.SalesApplication;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    private String id;

    private String productId;

    private Integer quantity;

    private String vendorId;

    @Embedded
    private Money totalAmount;

    public static OrderRepository repository() {
        OrderRepository orderRepository = SalesApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
//>>> DDD / Aggregate Root
