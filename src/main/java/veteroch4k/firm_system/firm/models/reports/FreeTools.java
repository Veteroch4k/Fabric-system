package veteroch4k.firm_system.firm.models.reports;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import veteroch4k.firm_system.firm.models.consumables.Tool;
import veteroch4k.firm_system.firm.models.consumables.ToolType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "free_tools")
public class FreeTools  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @OneToOne
  @JoinColumn(name = "tool_id")
  private Tool tool;

  @ManyToOne
  @JoinColumn(name = "toolType_id")
  private ToolType toolType;

  @Column(name = "receiveDate")
  private LocalDate receiveDate;


}
