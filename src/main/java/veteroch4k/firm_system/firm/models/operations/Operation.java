package veteroch4k.firm_system.firm.models.operations;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import veteroch4k.firm_system.firm.models.consumables.Material;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "operations")
public class Operation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "duration")
  private int duration; // Исчисляется часами

  @OneToMany(mappedBy = "operation",  cascade = CascadeType.ALL)
  private List<OpMaterials> operationList;

}
