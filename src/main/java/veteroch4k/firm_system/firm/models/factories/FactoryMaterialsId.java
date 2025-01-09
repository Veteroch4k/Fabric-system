package veteroch4k.firm_system.firm.models.factories;

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
public class FactoryMaterialsId implements Serializable {

  @Column(name = "factory_id")
  private int factory_id;

  @Column(name = "material_id")
  private int material_id;


}
