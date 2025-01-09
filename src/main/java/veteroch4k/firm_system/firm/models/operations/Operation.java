package veteroch4k.firm_system.firm.models.operations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Operation {

  private int id;

  private String name;

  private String description;

  private int duration; // Исчисляется часами

  private int factory_id;


}
