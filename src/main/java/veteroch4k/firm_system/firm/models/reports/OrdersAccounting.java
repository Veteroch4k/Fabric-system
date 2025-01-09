package veteroch4k.firm_system.firm.models.reports;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import veteroch4k.firm_system.firm.models.Product;
import veteroch4k.firm_system.firm.models.factories.Factory;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orders_accounting")
public class OrdersAccounting  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne
  @JoinColumn(name = "factory_id")
  private Factory factory;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;

  @Column(name = "quantity")
  private int quantity;




}

