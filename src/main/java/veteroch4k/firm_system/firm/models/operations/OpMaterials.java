package veteroch4k.firm_system.firm.models.operations;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
  private OpMaterialsId id;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("operationId")
  private Operation operation;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("materialId")
  private Material material;

  private int quantity;


}
