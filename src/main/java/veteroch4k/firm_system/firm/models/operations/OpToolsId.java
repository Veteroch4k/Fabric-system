package veteroch4k.firm_system.firm.models.operations;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OpToolsId implements Serializable {

  @Column(name = "operation_id")
  private int operation_id;

  @Column(name = "toolType_id")
  private int tool_type_id;

}
