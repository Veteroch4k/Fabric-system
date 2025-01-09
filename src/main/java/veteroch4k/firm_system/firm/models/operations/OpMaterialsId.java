package veteroch4k.firm_system.firm.models.operations;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpMaterialsId implements Serializable {

  @Column(name = "operation_id")
  private int operation_id;

  @Column(name = "material_id")
  private int material_id;

}
