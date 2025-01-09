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
import veteroch4k.firm_system.firm.models.consumables.Material;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "op_materials")
public class OpMaterials {

  @EmbeddedId
  private OpMaterialsId id = new OpMaterialsId();

  @ManyToOne
  @MapsId("operation_id")
  private Operation operation;

  @ManyToOne
  @MapsId("material_id")
  private Material material;

  private int quantity;

}
