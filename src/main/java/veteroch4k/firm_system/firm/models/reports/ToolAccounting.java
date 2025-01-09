package veteroch4k.firm_system.firm.models.reports;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import veteroch4k.firm_system.firm.models.Order;
import veteroch4k.firm_system.firm.models.consumables.Tool;
import veteroch4k.firm_system.firm.models.consumables.ToolType;
import veteroch4k.firm_system.firm.models.factories.Factory;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tools_accounting")
public class ToolAccounting  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @OneToMany
  @JoinColumn(name = "tools_id")
  private List<Tool> tools ;

  @ManyToOne
  @JoinColumn(name = "toolType_id")
  private ToolType toolType;

  @ManyToOne
  @JoinColumn(name = "factory_id")
  private Factory factory;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;


}
