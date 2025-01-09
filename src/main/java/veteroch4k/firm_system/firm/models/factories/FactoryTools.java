package veteroch4k.firm_system.firm.models.factories;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FactoryTools {

  private int factory_id;

  private int toolType_id;

  private int quantity;

}
