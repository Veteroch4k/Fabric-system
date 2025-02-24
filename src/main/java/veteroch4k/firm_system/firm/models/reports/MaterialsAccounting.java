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
import java.time.LocalDate;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import veteroch4k.firm_system.firm.models.Order;
import veteroch4k.firm_system.firm.models.Product;
import veteroch4k.firm_system.firm.models.consumables.Material;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "materials_accounting")
public class MaterialsAccounting  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne
  @JoinColumn(name = "material_id")
  private Material material;

  @Column(name = "quantity")
  private int quantity;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;

  @ManyToOne
  @JoinColumn(name = "employer_id")
  private Employer employer;

  @Column(name = "date")
  private LocalDate date;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;

}
