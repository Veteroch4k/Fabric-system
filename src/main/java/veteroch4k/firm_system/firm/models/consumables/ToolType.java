package veteroch4k.firm_system.firm.models.consumables;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "toolTypes")
public class ToolType {

  private int id;

  private String name;

  private String description;

}
