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
public class FactoryToolsId implements Serializable {

  @Column(name = "factory_id")
  private int factory_id;

  @Column(name = "toolType_id")
  private int toolType_id;

}
