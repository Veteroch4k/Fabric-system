package veteroch4k.firm_system.firm.models.factories;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import veteroch4k.firm_system.firm.models.consumables.ToolType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "factory_tools")
public class FactoryTools {

  @EmbeddedId
  private FactoryToolsId id = new FactoryToolsId();

  @ManyToOne
  @MapsId("factory_id")
  private Factory factory;

  @ManyToOne
  @MapsId("toolType_id")
  private ToolType toolType;

  private int quantity;

}
