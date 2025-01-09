package veteroch4k.firm_system.firm.models.operations;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import veteroch4k.firm_system.firm.models.consumables.Tool;
import veteroch4k.firm_system.firm.models.consumables.ToolType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "op_tools")
public class OpTools {

  @EmbeddedId
  private OpToolsId id = new OpToolsId();

  @ManyToOne
  @MapsId("operation_id")
  private Operation operation;

  @ManyToOne
  @MapsId("toolType_id")
  private ToolType toolType;

  private int quantity;


}
