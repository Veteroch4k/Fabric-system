package veteroch4k.firm_system.firm.models.operations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import veteroch4k.firm_system.firm.models.factories.Factory;

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

}
