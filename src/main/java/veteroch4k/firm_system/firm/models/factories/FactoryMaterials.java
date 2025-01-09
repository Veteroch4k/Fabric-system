package veteroch4k.firm_system.firm.models.factories;


import jakarta.persistence.Column;
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
@Table(name = "factory_materials")
public class FactoryMaterials {

  @EmbeddedId
  private FactoryMaterialsId id = new FactoryMaterialsId();

  @ManyToOne
  @MapsId("factory_id")
  private Factory factory ;

  @ManyToOne
  @MapsId("material_id")
  private Material material;

  @Column(name = "quantity")
  private int quantity;

}
