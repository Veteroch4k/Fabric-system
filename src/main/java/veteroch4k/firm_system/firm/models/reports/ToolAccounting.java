package veteroch4k.firm_system.firm.models.reports;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
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

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "toolAccounting")
  private List<ToolAccountingTools> tools ;

  @ManyToOne
  @JoinColumn(name = "tool_type_id")
  private ToolType toolType;

  @ManyToOne
  @JoinColumn(name = "factory_id")
  private Factory factory;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;


}
